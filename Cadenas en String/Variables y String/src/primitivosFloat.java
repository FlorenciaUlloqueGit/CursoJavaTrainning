public class primitivosFloat {
  static  float varFlotante; //si la declaro fuera del main y le pongo static la toma.
    //esta es ya una variable de la clase del tipo static.

    public static void main(String[] args) {
        float realFloat = 2120f; //para indicar que es float y que no crea que es double
        float floatconNotacion= 2.12e3f;


        //ejemplo de cuado se corre a la izquierda
        float floatNeg = 1.5e-10f;// 0.00000000015;
        float floatNegSinNotacion =  0.00000000015f; // lo muestra en consola con notación
        System.out.println("realFloat = " + realFloat);
        System.out.println("floatNegSinNotacion = " + floatNegSinNotacion);
        System.out.println("floatNeg = " + floatNeg);


        float tipoFloat=  0.00000000015f; ; //si le agrego la l se convierte la literal entera en un tipo lomg
        System.out.println("tipoFloat = " + tipoFloat);
        System.out.println("tipo float corresponde a " + Float.BYTES); // 4
        System.out.println("tipo  float  corresponde a " +Float.SIZE); // 32
        System.out.println("valor max de un  float" +  Float.MAX_VALUE); //3.4028235E38
        System.out.println("valor min de un float" +  Float.MIN_VALUE); //1.4E-45

        double doblePrecision = 3.446456456456454;
        System.out.println("doblePrecision = " + doblePrecision);
        System.out.println("tipo double corresponde a " + Double.BYTES); // 8
        System.out.println("tipo  double  corresponde a " +Double.SIZE); // 64
        System.out.println("valor max de un  double" +  Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println("valor min de un double" +  Double.MIN_VALUE); //4.9E-324


      //  var varFlotante = 3.1416; //se hace double de forma automatica por el punto a menos que le ponga f al final.

        System.out.println("varFlotante = " + varFlotante); //si pongo el cursor sobre varFlotante es un double....

    }
}
