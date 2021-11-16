public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2; //forma implícita.
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1>num2; //false
        Boolean objetoBoolean =  Boolean.valueOf(primBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false"); //instancia a partir de us String
        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);
        Boolean objetoBoolean3 = true;


        System.out.println( "comparando dos objetos boolean: " + (objetoBoolean == objetoBoolean2));
        //son iguales, porque no se comporta igual que los enteros.
        System.out.println( "comparando dos objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println( "comparando dos objetos boolean: " + (objetoBoolean2 == objetoBoolean3));
        System.out.println( "comparando dos objetos boolean: " + (objetoBoolean == objetoBoolean3));

        boolean primBoolean2 = objetoBoolean2.booleanValue(); //forma explícita
        System.out.println("primBoolean2 = " + primBoolean2);



    }
}
