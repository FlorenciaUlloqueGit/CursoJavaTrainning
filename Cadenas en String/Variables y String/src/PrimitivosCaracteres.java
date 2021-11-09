public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a'; //para char se usa comilla simple, para el tipo char es un solo caracter.
        var caracterUnicode = '\u0040'; // en unicode hace el @ -- se le agrega la barra espaciadora antes y luego se agrega el codigo unicode.
        int decimal = 64; //transforma al arroba en unicode. SE pone solo el numero en el codigo html. Para el  es 64
        System.out.println("caracter = " + caracter);
        System.out.println("caracterUnicode = " + caracterUnicode);
        System.out.println("decimal = caracterUnicode:" + (decimal == caracterUnicode));//parentesis para que se resuelva lo primero. Devuelve true si son iguales

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracterUnicode" + (simbolo == caracterUnicode));

         char espacio= '\u0020'; //agregar espacio
         char retroceso= '\b'; //espacio hacia atras, para borrar un caracter.
        char tabulador = '\t'; //tabulador
        char nuevaLinea = '\n'; //salto de linea
        char retornoCarro = '\r'; //salto de carro
        System.getProperty("line.separator"); //para separar


        System.out.println("char corresponde en byte ="+  System.getProperty("line.separator")+Character.BYTES); // = 2
        System.out.println("char corresponde en tamaño = " + Character.SIZE); // = 16
        System.out.println("el minimo valor de char es = " + Character.MIN_VALUE); // espacio
        System.out.println("el max valor del char es = " + Character.MAX_VALUE);// = espacio

    }

}
