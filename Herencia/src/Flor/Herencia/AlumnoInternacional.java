package Flor.Herencia;

public  final class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

  public AlumnoInternacional(){
      System.out.println("Alumno intertnacional: inicializando el constructor");
  }
  public AlumnoInternacional(String nombre, String ape, String pais, double  notaIdiomas){
      super(nombre, ape);
      this.pais = pais;
      this.notaIdiomas = notaIdiomas;
  }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
      return super.saludar() + "Soy extranjero y vengo de  " + getPais();
    }

    @Override
    public double calcularPromedio() {
      //  System.out.println("calcularPromedio =" + AlumnoInternacional.class.getCanonicalName());
        return (super.calcularPromedio() * 3 + notaIdiomas ) /4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n pais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
