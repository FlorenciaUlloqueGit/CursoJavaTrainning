package Tarea;

public class Caninos extends Mamifero{
    protected String color;
    protected float tamColmillos;

    public String getColor() {
        return color;
    }

    public float getTamColmillos() {
        return tamColmillos;
    }

    public Caninos(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamColmillos = tamColmillos;
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
        return super.toString() + "color='" + color + '\'' +
                ", tamColmillos=" + tamColmillos;
    }
}
