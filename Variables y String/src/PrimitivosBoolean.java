public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;

     //   Boolean datoLogico = Boolean.FALSE.booleanValue(); //son clases que envuelve al primitivo boolean.
        //se convierte en la instancia primitiva del tipo boolean automáticamente.

        //   Boolean datoLogico = true; --- es una instancia de una instancia de una clase, tambien se puede usar.
        System.out.println("datoLogico = " + datoLogico);

        double d = 353454.43e-3; //353.45443
        float f = 1.2345e2f;// 123.45
                
                datoLogico = d> f;
        System.out.println("datoLogico = " + datoLogico);


        boolean esIgual = ( 3-2== 1);
        System.out.println("esIgual = " + esIgual);
    }
}
