package Tarea;

public class Felino extends Mamifero{
    protected float tamGarrras;
    protected  int velocidad;

    public float getTamGarrras() {
        return tamGarrras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamGarrras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamGarrras = tamGarrras;
        this.velocidad = velocidad;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }



    @Override
    public String toString() {
        return super.toString() +   "tamGarrras=" + tamGarrras +
                ", velocidad=" + velocidad;
    }
}
