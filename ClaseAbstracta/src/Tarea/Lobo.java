package Tarea;

public class Lobo extends Caninos{
    private int numCamada;
    private String especie;

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecie() {
        return especie;
    }

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamColmillos, int numCamada, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.numCamada = numCamada;
        this.especie = especie;
    }

    @Override
    public String comer() {
        return " el lobo come mucho y pesa " +getPeso() + " km";
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cavernas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "El lobo corre con la camada n° " + numCamada ;
    }

    @Override
    public String comunicarse() {
        return "el lobo se comunica aullando";
    }



    @Override
    public String toString() {
        return super.toString() +  "numCamada=" + numCamada +
                ", especie='" + especie;
    }
}
