package Tarea1;

public class Cliente  extends Persona{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(String nombre, String apellido, String numFiscal, String direccion, int id) {
        super(nombre, apellido, numFiscal, direccion);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " Id Cliente= " +getId();
    }
}
