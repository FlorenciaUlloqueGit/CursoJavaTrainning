public class AutoboxingInteger {
    public static void main(String[] args) {
        // autoboxing = anidar un primitov en la clase integer y viceversa
        
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
        int suma = 0;
        int suma2 = 0;
        for (Integer i: enteros ) {
            if(i.intValue() %2 == 0){ //suma solo los pares. inbt.value retorna solo el valor primitivo de la clase Integer.
                suma+= i.intValue();
            }
            
        }
        System.out.println("suma = " + suma);


        for (Integer i: enteros ) { //forma implícita
            if(i %2 == 0){ //suma solo los pares. inbt.value retorna solo el valor primitivo de la clase Integer.
                suma2+= i;
            }

        }
        System.out.println("suma = " + suma2);
        
    }
}
