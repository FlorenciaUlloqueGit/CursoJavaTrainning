public class TextAreaFor  extends ElementosForm{

    private int filas;
    private int col;

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public TextAreaFor(String nombre) {
        super(nombre);
    }

    public TextAreaFor(String nombre, int filas, int col) {
        super(nombre);
        this.filas = filas;
        this.col = col;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" + nombre
                +"'  cols='"+col
                +"' rows='"+ filas+"' > " + valor +"</textarea>";
    }
}
