package Flor.Herencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMate;
    private double notaLengua;
    private double notaHist;

    public Alumno() {
        System.out.println("Alumno: inicializando el constructor");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido); //super hace ref al constructor del padre
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);

    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaHist, double notaLengua, double notaMate) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
        this.notaHist = notaHist;
        this.notaLengua = notaLengua;
        this.notaMate = notaMate;

    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHist() {
        return notaHist;
    }

    public void setNotaHist(double notaHist) {
        this.notaHist = notaHist;
    }


    @Override
    public String saludar(){
        return  super.saludar() + " soy un alumno y mi nombre es " + this.getNombre();
    } //al usar super uso el return de persona y lo sobreescribo al agregarle  más datos

    public  double calcularPromedio(){
     //   System.out.println("calcularPromedio =" + Alumno.class.getCanonicalName());
        return  (notaHist + notaMate + notaLengua) /3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n institucion='" + institucion + '\'' +
                ", notaMate=" + notaMate +
                ", notaLengua=" + notaLengua +
                ", notaHist=" + notaHist +
                ", promedio " + this.calcularPromedio();
    }
}
