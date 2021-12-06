public enum Color {
    ROJO("Rojo"),
    AMARILLO ("Amarillo"),
    AZUL ("Azul"),
    GRIS ("Gris"),
    BLANCO("Blanco"),
    NARANJA("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    };
    @Override
    public String toString(){ //con esto todo se pasa a minuscula porqyue se hace un String
        return this.color;
    }
}
