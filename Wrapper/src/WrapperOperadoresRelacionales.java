public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num2 = " + num2); //son bojetos mas que numeros que contienen un valor.
        System.out.println("num1 = " + num1);

        System.out.println("Son el mismo objeto?"+ (num1== num2));

        num2 = 1000 ;

        System.out.println("num2 = " + num2); //son bojetos mas que numeros que contienen un valor.
        System.out.println("num1 = " + num1);

        System.out.println("Son el mismo objeto?"+ (num1== num2)); //ya no son el mismo objeto, es otro objeto aunque tengan el mismo valor.
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2))); //true

        //otra forma es convertirlos en primitivos

        System.out.println("tienen el mismo valor?" +( num1.intValue() == num2.intValue()));
          boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        //es lo mismo pero la conversión es explícita.
        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion = " + condicion2);
    }
}
