import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class AnalizadorVisitor extends miniBParserBaseVisitor<String> {

    // Para manejar los comentarios
    @Override
    public String visitComentario(miniBParser.ComentarioContext ctx) {
        // Los comentarios en Jasmin se generan con la directiva `;`
        return ";" + ctx.getText() + "\n";
    }

    // Para manejar asignaciones
    @Override
    public String visitAsignacion(miniBParser.AsignacionContext ctx) {
        StringBuilder code = new StringBuilder();
        
        if (ctx.LET() != null) {
            // Si es una asignación de LET
            String variable = visit(ctx.identificador());
            code.append(variable).append(" = ").append(visit(ctx.expresion())).append("\n");
        } else if (ctx.INPUT() != null) {
            // Si es una asignación de INPUT (por ejemplo, leer un valor)
            String variable = visit(ctx.identificador());
            code.append("input ").append(variable).append("\n");
        }
        
        return code.toString();
    }

    // Para manejar las expresiones aritméticas
    @Override
    public String visitOperacionAditiva(miniBParser.OperacionAditivaContext ctx) {
        String left = visit(ctx.expresion(0)); // El primer término
        String right = visit(ctx.expresion(1)); // El segundo término
        String op = ctx.MAS() != null ? "+" : "-"; // Verifica si es suma o resta
        
        return left + right + "add\n"; // Asumimos una suma como ejemplo
    }

    @Override
    public String visitTerminoBase(miniBParser.TerminoBaseContext ctx) {
        return visit(ctx.factor());
    }

    @Override
    public String visitOperacionMultiplicativa(miniBParser.OperacionMultiplicativaContext ctx) {
        String left = visit(ctx.termino(0)); // El primer término
        String right = visit(ctx.termino(1)); // El segundo término
        String op = ctx.POR() != null ? "*" : "/";
        
        return left + right + "mul\n"; // Asumimos una multiplicación como ejemplo
    }

    @Override
    public String visitFactorBase(miniBParser.FactorBaseContext ctx) {
        // Si es un número o una cadena o identificador
        if (ctx.numero() != null) {
            return "ldc " + visit(ctx.numero()) + "\n"; // Cargar constante (ejemplo)
        }
        if (ctx.string() != null) {
            return "ldc " + visit(ctx.string()) + "\n"; // Cargar constante de string
        }
        return visit(ctx.identificador()); // Para identificadores, cargamos la variable
    }

    @Override
    public String visitId(miniBParser.IdContext ctx) {
        return "load " + ctx.getText() + "\n"; // Cargar el valor de una variable
    }

    @Override
    public String visitNum(miniBParser.NumContext ctx) {
        return ctx.getText(); // Retorna el valor numérico directamente
    }

    @Override
    public String visitCadena(miniBParser.CadenaContext ctx) {
        return ctx.getText(); // Retorna la cadena
    }

    // Para manejar el bloque de control if
    @Override
    public String visitCondicionalIf(miniBParser.CondicionalIfContext ctx) {
        StringBuilder code = new StringBuilder();
        String condition = visit(ctx.expresion());
        code.append("if ").append(condition).append(" goto ").append("labelIfTrue\n");

        // Generar el bloque "then"
        code.append(visit(ctx.bloque(0))); // Visitar el bloque dentro de "then"
        
        if (ctx.ELSE() != null) {
            code.append("goto ").append("labelEndIf\n");
            code.append("labelIfTrue:\n");
            code.append(visit(ctx.bloque(1))); // Visitar el bloque "else"
        }

        code.append("labelEndIf:\n");
        return code.toString();
    }

    // Para manejar los ciclos while
    @Override
    public String visitCicloWhile(miniBParser.CicloWhileContext ctx) {
        StringBuilder code = new StringBuilder();
        String condition = visit(ctx.expresion());
        
        code.append("while ").append(condition).append(" do\n");
        code.append(visit(ctx.bloque())); // Visitar el bloque dentro del ciclo
        code.append("endwhile\n");

        return code.toString();
    }

    // Otros métodos de generación de código
    @Override
    public String visitSentencia(miniBParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }
}
