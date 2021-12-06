package Tarea;

public class Perro extends Caninos{
    private int fuerzaMordida;

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro come balanceado";
    }

    @Override
    public String dormir() {
        return "Duerme todo el dia ";
    }

    @Override
    public String correr() {
        return "corre cuando lo pasean";
    }

    @Override
    public String comunicarse() {
        return "ladra llora y rasca la puerta hasta entrar";
    }



    @Override
    public String toString() {
        return super.toString() + "fuerzaMordida=" + fuerzaMordida;
    }
}
