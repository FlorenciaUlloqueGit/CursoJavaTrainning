public class SentenciaFor {


    public static void main(String[] args) {

        for (int i = 0; i <5; i++) {
            System.out.println("i = " + i);

        }
       // System.out.println("i fuera = " + i); //aca es igual a 5 porque incrementa por postincremento

        for (int i = 10; i <0 ; i--) {
            System.out.println("i = " + i);
        }

        for (int i = 1, j =10;  i<j;  i++, j--) {

            System.out.println("j = " + j);
        }

        for (int i = 0; i <= 10 ; i++) {
            if( i% 2 == 0){
                continue; // en vez de salirse del for sale de la iteración. hace que solo se impriman num impares

            }

        }
    }
}
