package Tarea3;

public class Cliente extends Persona {
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

    public Cliente(String nombre, String apellido,  int id) {
        super(nombre, apellido);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " Id Cliente= " + getId();
    }
}
