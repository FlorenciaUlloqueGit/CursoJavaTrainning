public class OperadoresUnarios { //vemos como funcionan los numeros negativos
    public static void main(String[] args) {
        int i = -5;
        int j = +i; //j es igual al positivo de i // j = (1)+i -> 5
        System.out.println("j = " + j); // igual a -5
        
        int k = -i; //k = (-1) *i => 5 //al ser menos * menos = mas queda positivo
        System.out.println("k = " + k);
        
        i = 6;
        j = +i;
        System.out.println("j = " + j); // = 6;
        
        k=-i;
        System.out.println("k = " + k); //= -6
    }
}
