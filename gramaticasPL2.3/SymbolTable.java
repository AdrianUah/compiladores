import java.util.HashMap;

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

}
