public class ConversionDeTiposDeDatos {
    public static void main(String[] args) {
       //DE STRING A INT
        String numero = "50"; //String tiene comillas dobles y char simples.
        int numeroIntr = Integer.parseInt(numero); //convierto de string a int.
        System.out.println("numeroIntr = " + numeroIntr);

        //DE STRING A DOUBLE
        String realStr= "35345.34";
        double real = Double.parseDouble(realStr);
        System.out.println("real = " + real);

        //DE STRING A DOUBLE CON NOTACION CIENTIFICA:
        String realStrg= "3534534e-2";
        double reald = Double.parseDouble(realStrg);
        System.out.println("reald = " + reald);

        //DE STRING A BOOLEAN
        String logicoStr = "true"; // lo que salga de true y false, ej 1, 0 o lo que sea es false.(Excepto TRUE o TruE(combinaciones))
        boolean bol = Boolean.parseBoolean(logicoStr);
        System.out.println("bol = " + bol);

        //DE TIPO PRIMITIVO A STRING:!!!
        int otroNumInt = 100;
        System.out.println("otroNumInt = " + otroNumInt);
        String otroNumeroStr = Integer.toString(otroNumInt+10); //de int a String.  suma y despues pasa a String
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        //otra forma:
        otroNumeroStr = String.valueOf(otroNumInt); //sobrecarga de metodo: mismo nombre o metodo pero distintos parametros y cantidad.
        System.out.println("otroNumeroStr = " + otroNumeroStr); //valueof acepta una secuencia, una arreglo de char, de caracteres.

        double otroDouble = 1234.41e2;
        String otroRealSTR = Double.toString(otroDouble);
        System.out.println("otroRealSTR = " + otroRealSTR);

        String real3Str = String.valueOf(1.23456e2f); //convierto float a String.
        System.out.println("real3Str = " + real3Str);
        
//              CONVERSIONES ENTRE TIPOS PRIMITIVOS (CASTEO)

        int i =22768;
        short s= (short) i;//si no casteo da error
        System.out.println("s = " + s);
        long l= i ;//no marca error porque no hay pérdida de info al ser el long mayor.
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE); //debe el short ser menor a 32767 para que no haga falta casteo para el int. sino resta
    //hay tipos incompatibles: no se puede castear por ej un int a un boolean
        // se puede castear entre primitivos los tipo numericos, char y double y float.

        double tipoDouble =443555.5645;
        double d = (double) i;
        System.out.println("d = " + d);

      //  int x = (double) d; no se puede al ser int menor... perdida de datos



}}
