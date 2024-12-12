/*import java.util.HashMap;

class SymbolTable {
    private HashMap<String, Symbol> table;

    public SymbolTable() {
        this.table = new HashMap<>();
    }

    // Agregar una nueva variable
    public void addSymbol(String name, String type, Object value) throws Exception {
        if (table.containsKey(name)) {
            throw new Exception("Error: La variable '" + name + "' ya ha sido declarada.");
        }
        table.put(name, new Symbol(name, type, value));
    }

    // Buscar una variable
    public Symbol getSymbol(String name) throws Exception {
        if (!table.containsKey(name)) {
            throw new Exception("Error: La variable '" + name + "' no está declarada.");
        }
        return table.get(name);
    }

    // Actualizar el valor de una variable
    public void updateSymbol(String name, String type, Object value) throws Exception {
        if (!table.containsKey(name)) {
            throw new Exception("Error: La variable '" + name + "' no está declarada.");
        }
        Symbol symbol = table.get(name);
        symbol.value = value;
        symbol.type = type;
    }

    // Verificar si una variable existe
    public boolean containsSymbol(String name) {
        return table.containsKey(name);
    }

    // Obtener el tipo de una variable
    public String getType(String name) throws Exception {
        if (!table.containsKey(name)) {
            throw new Exception("Error: La variable '" + name + "' no está declarada.");
        }
        return table.get(name).type; // Acceder al campo 'type' del objeto Symbol
    }

    // Obtener el valor de un símbolo como cadena
    public String getValue(String name) throws Exception {
        if (!table.containsKey(name)) {
            throw new Exception("Error: La variable '" + name + "' no está declarada.");        
        }
        Object value = table.get(name).value;

        // Si el valor es una cadena, simplemente lo devolvemos
        if (value instanceof String) {
            return (String) value;
        }

        // Si no es una cadena, usamos el toString()
        return value != null ? value.toString() : "";
    }
}*/
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Symbol> symbols;

    public SymbolTable() {
        symbols = new HashMap<>();
    }

    public void addSymbol(String name, String type, Object value) throws RuntimeException {
        if (symbols.containsKey(name)) {
            throw new RuntimeException("Error: Variable '" + name + "' ya está definida.");
        }
        symbols.put(name, new Symbol(name, type, value));
    }

    public Symbol containsSymbol(String name) throws RuntimeException {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        }else{
            return null;
        }
    }



    public void updateSymbol(String name, Object newValue) throws RuntimeException {
        if (!symbols.containsKey(name)) {
            throw new RuntimeException("Error: Variable '" + name + "' no está definida.");
        }
        symbols.get(name).setValue(newValue);
    }

    public void display() {
        System.out.println("Tabla de símbolos:");
        for (Symbol symbol : symbols.values()) {
            System.out.println(symbol);
        }
    }
}

class Symbol {
    private String name;
    private String type;
    private Object value;

    public Symbol(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Tipo: " + type + ", Valor: " + value;
    }
}
