class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
       this.nombre = nuevoNombre; //this para decir que corresponde a la misma clase o instancia.

    }
    public String leerNombre(){
        return this.nombre;


    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("andres");
        System.out.println("persona = " + persona);

        System.out.println("Iniciamos el main ");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("antes de invocar al método test");
        test(persona);
        System.out.println("persona = " + persona.leerNombre());

        System.out.println("después de invocar al método test");


        System.out.println("Finaliza el método main "); //se modifica la persona xq son el mismo objeto
    }
    public static  void test(Persona persona){ //el main puede invocar este método
        System.out.println("Iniciamos el método test" );
        persona.modificarNombre("pepe");

        System.out.println("Finaliza el método test");
    }
}
