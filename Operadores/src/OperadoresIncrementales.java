public class OperadoresIncrementales {
    public static void main(String[] args) {
        //PREINCREMENTO
        int i = 1;
        int j = ++i; // es igual i= 1+i, entonces j = 2
        System.out.println("i = " + i); // i vale 2 porque en j se incrementa
        System.out.println("j = " + j); // j vale 2 porque primero se asigna y despues se incrementa
        
        
        //POSTINCREMENTO
        
        i= 2;
        System.out.println("valor inicial de i = " + i); //todavia no se incrementó
        j = i++; //sigue valiendo dos porque primero se asigna y después incrementa.
        System.out.println("i = " + i); //i vale 3 porque en jota se incrementa
        System.out.println("j = " + j);


        //PREDECREMENTO
        i = 3;
        j = --i;
        System.out.println("i = " + i); // i vale 2 poruqe se decrementa en j.
        System.out.println("j = " + j);  // j vale dos poruqe se decrementa en j

        //POSTDECREMENTO:
        i= 4;
        j = i--;
        System.out.println("i = " + i); //i vale 3 porque decrementa en j
        System.out.println("j = " + j); //J vale 4 porque al ser post se decrementa despues de asignarse.

        System.out.println("(++j) = " + (++j)); //J= 5
        System.out.println("(j++) = " + (j++)); // j = 5 poirque todavia no se incremento
        System.out.println("j = " + j); // j = 6


    }
}
