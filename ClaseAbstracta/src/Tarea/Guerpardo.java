package Tarea;

public class Guerpardo extends Felino {


    public Guerpardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamGarrras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarrras, velocidad);
    }

    @Override
    public String comer() {
        return "el guepardo come carne y fruta";
    }

    @Override
    public String dormir() {
        return "el guepardo. tambien llamado " + getNombreCientifico() + " duerme mucho";
    }

    @Override
    public String correr() {
        return "el guepardo corre 20 km /hs";
    }

    @Override
    public String comunicarse() {
        return "el guepardo se comunica con rugidos";
    }



    @Override
    public String toString() {
        return super.toString() +"tamGarrras=" + tamGarrras +
                ", velocidad=" + velocidad;
    }
}
