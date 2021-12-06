package Tarea;

public class Tigre extends Felino{
    private String especie;


    public String getEspecie() {
        return especie;
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamGarrras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarrras, velocidad);
        this.especie = especie;
    }

    @Override
    public float getTamGarrras() {
        return super.getTamGarrras();
    }

    @Override
    public String comer() {
        return "el tigre come 3ks de carne por dia";
    }

    @Override
    public String dormir() {
        return "el tigre duerme 7 hs por dia ";
    }

    @Override
    public String correr() {
        return"el tigre corre a 30 ks por hora";
    }

    @Override
    public String comunicarse() {
        return "el tigre es un " + especie + " que se comunica por rugidos";
    }




}
