public class WrapperInteger {
    public static void main(String[] args) {

        //Integer intObjeto = new Integer(32445); // no es bueno instanciar la clase Wrapper. Es obsoleta, deprecater
        Integer intObjeto = Integer.valueOf(1234); //forma explícita.
        Integer intObj2 = 2423; //forma implícita.

        int intPrimitivo = 32768;
        Integer intObjeto3 = Integer.valueOf(intPrimitivo); //convierte int en Integer.

        int num = intObjeto;  //transforma la clase a primitivo.
        System.out.println("num = " + num);
        int num1 = intObjeto.intValue(); // hace la clase en primitivo
        System.out.println("num1 = " + num1);


        String valorTv = "67000";
        Integer valor = Integer.valueOf(valorTv); //de String a Integer.

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto); //de int a short.

        Byte byteObjeto = intObjeto.byteValue(); //hay pérdida de info xq byte el valor de byte es mas chico que int
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto); //de int a long no hay operdida de info.











    }
}
