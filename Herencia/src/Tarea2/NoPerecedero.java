package Tarea2;

public class NoPerecedero {
    private int contenido;
    private int calorias;

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public NoPerecedero(int contenido, int calorias) {
        this.contenido = contenido;
        this.calorias = calorias;
    }



    @Override
    public String toString() {
        return super.toString() + "contenido=" + contenido +
                ", calorias=" + calorias;
    }
}
