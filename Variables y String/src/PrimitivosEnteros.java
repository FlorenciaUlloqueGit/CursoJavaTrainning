public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        //representan 1 solo bit que se puede almacenar en 8 bit
        System.out.println("tipo byte corresponde a " + Byte.BYTES); // =1
        System.out.println("tipo byte corresponde a " + Byte.SIZE); //= 8
        System.out.println("valor max de un byte" + Byte.MAX_VALUE); //= 127
        System.out.println("valor min de un byte" + Byte.MIN_VALUE); //= -128


        //PASAMOS A SHORT

        short numShort = 30000;
        System.out.println("numShort = " + numShort);
        System.out.println("numeroByte = " + numeroByte);
        //representan 1 solo bit que se puede almacenar en 8 bit
        System.out.println("tipo short corresponde a " + Short.BYTES); // 2
        System.out.println("tipo Short. corresponde a " + Short.SIZE); //16
        System.out.println("valor max de un Short." + Short.MAX_VALUE); //32767
        System.out.println("valor min de un Short." + Short.MIN_VALUE); //-32768

        int numInt = 30000;
        System.out.println("numInt = " +  numInt);


        System.out.println("tipo int corresponde a " + Integer.BYTES); // 4
        System.out.println("tipo int corresponde a " +Integer.SIZE); // 32
        System.out.println("valor max de un int" +  Integer.MAX_VALUE); //2147483647
        System.out.println("valor min de un int" +  Integer.MIN_VALUE); //-2147483648



        long numLong = 3000000000000L; //si le agrego la l se convierte la literal entera en un tipo lomg
        System.out.println("numLong = " +  numLong );

        //representan 1 solo bit que se puede almacenar en 8 bit
        System.out.println("tipo Long  corresponde a " + Long.BYTES); // 8
        System.out.println("tipo Long  corresponde a " +Long.SIZE); // 64
        System.out.println("valor max de un long" +  Long.MAX_VALUE); //9223372036854775807
        System.out.println("valor min de un long" +  Long.MIN_VALUE); //-9223372036854775808


        var numeroVar = 127;


    }
}
