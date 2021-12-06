package Tarea;

public class Leon extends Felino{
    private int manada;
    private float potenciaRugido;

    public int getManada() {
        return manada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamGarrras, int velocidad, int manada, float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarrras, velocidad);
        this.manada = manada;
        this.potenciaRugido = potenciaRugido;
    }



    @Override
    public String comer() {
        return "El León caza junto a su grupo de nro manada = " + manada +" en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El leon duerme 15 hs x dia";
    }

    @Override
    public String correr() {
        return "El leon corre a " + velocidad +"  km/hs";
    }

    @Override
    public String comunicarse() {
        return "El leon se comunica con la potencia de su rugido igual a " + potenciaRugido;
    }



    @Override
    public String toString() {
        return super.toString() + " manada= "+ manada +
        ", potenciaRugido=" + potenciaRugido;
    }
}
