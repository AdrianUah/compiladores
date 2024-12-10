class Symbol {
    String name;
    String type; // Por ejemplo: "int", "string", etc.
    Object value; // El valor actual de la variable, puede ser null si no está inicializada.

    public Symbol(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
}
