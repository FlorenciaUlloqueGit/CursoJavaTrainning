public class Postulante {
        private int id;
        private String nombre;
        private int idVacante;
        private float sueldo;
        private int experiencia;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Postulante() {

    }

    public Postulante(int id, String nombre, int idVacante, float sueldo, int experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.idVacante = idVacante;
        this.sueldo = sueldo;
        this.experiencia = experiencia;
    }
}
