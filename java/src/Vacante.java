public class Vacante {
    private int id;
    private String denominacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Vacante() {

    }

    public Vacante(int id, String denominacion) {
        this.id = id;
        this.denominacion = denominacion;
    }
}
