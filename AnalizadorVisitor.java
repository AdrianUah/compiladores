import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class AnalizadorVisitor extends miniBParserBaseVisitor<String> {
    private SymbolTable symbolTable = new SymbolTable();

    // Para manejar los comentarios
    @Override
    public String visitComent(miniBParser.ComentContext ctx) {
        // Los comentarios en Jasmin se generan con la directiva `;`
        return ";" + ctx.getText() + "\n";
    }

    @Override
    public String visitAsign(miniBParser.AsignContext ctx) {
        String varName = ctx.identificador().getText();
        String value = visit(ctx.expresion());

        // Inferir tipo del valor asignado
        String type = inferType(value);

        try {
            // Si la variable ya existe, actualizar el valor
            if (symbolTable.containsSymbol(varName) != null) {
                symbolTable.updateSymbol(varName, value);
            } else {
                // Si no existe, agregar a la tabla
                symbolTable.addSymbol(varName, type, value);
            }
        } catch (RuntimeException e) {
            System.err.println("Error semántico: " + e.getMessage());
        }
        System.out.println (String.format("    ; Asignación de %s\n%s    istore %d\n", varName, value, varName.hashCode() % 100));
        return String.format("    ; Asignación de %s\n%s    istore %d\n", varName, value, varName.hashCode() % 100);
    }
    

    @Override
    public String visitPrint(miniBParser.PrintContext ctx) {
        String expressionCode = visit(ctx.expresion());
        
        // Determinar el tipo de la expresión (asumiendo que el visit devuelve metadatos sobre el tipo)
        boolean isString = ctx.expresion() instanceof miniBParser.StrinContext; // Suponiendo que tienes un contexto para cadenas

        // Generar código basado en el tipo
        String methodSignature = isString
            ? "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"
            : "invokevirtual java/io/PrintStream/println(I)V";

        return String.format(
            "    getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
            "%s" +
            "    %s\n",
            expressionCode,
            methodSignature
        );
    }

    @Override
    public String visitNum(miniBParser.NumContext ctx) {
        // Código para un número literal
        return "    ldc " + ctx.getText() + "\n";
    }

    @Override
    public String visitStrin(miniBParser.StrinContext ctx) {
        String rawString = ctx.getText(); 
        String content = rawString.substring(1, rawString.length() - 1); // Quitar comillas
        // Generar el código para cargar la cadena en la pila
        return String.format("    ldc \"%s\"\n", content);
    }

    @Override
    public String visitId(miniBParser.IdContext ctx) {
        String varName = ctx.getText();
        try {
            Symbol symbol = symbolTable.containsSymbol(varName);
            return symbol.getValue().toString();
        } catch (RuntimeException e) {
            System.err.println("Error semántico: Variable '" + varName + "' no definida.");
            return null;
        }
    }

    @Override
    public String visitInput(miniBParser.InputContext ctx) {
        String inputString = ctx.string().getText(); // Captura el string literal del input
        String varName = ctx.identificador().getText(); // Captura el identificador
    
        // Registrar la variable en la tabla de símbolos si no existe
        try {
            // Si la variable ya existe, actualizar el valor
            if (symbolTable.containsSymbol(varName) != null) {
                symbolTable.updateSymbol(varName, inputString);
            } else {
                // Si no existe, agregar a la tabla
                symbolTable.addSymbol(varName, "string", inputString);
            }
        } catch (RuntimeException e) {
            System.err.println("Error semántico: " + e.getMessage());
        }
        return inputString;
    }

    private String inferType(String value) {
        if (value == null) return "unknown";  // Manejo de valores nulos

        try {
            Integer.parseInt(value.trim());
            return "int";
        } catch (NumberFormatException e1) {
            try {
                Double.parseDouble(value.trim());
                return "float";
            } catch (NumberFormatException e2) {
                if ("true".equalsIgnoreCase(value.trim()) || "false".equalsIgnoreCase(value.trim())) {
                    return "bool";
                }
                return "string";
            }
        }
    }
}
