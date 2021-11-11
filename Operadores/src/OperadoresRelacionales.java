public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3; 
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        
        boolean b1 = i==j;
        System.out.println("b1 = " + b1);
        
                boolean b2 = !b1; //negacion del falso
        System.out.println("b2 = " + b2);
              boolean  b3 = i != j;
        System.out.println("b3 = " + b3); //retorna true

        boolean b4 = m==true;
        System.out.println("b4 = " + b4); //es falso porqe m = false;
        boolean b5 = m!= true; //retorna true

        boolean b6 = i>j;
        System.out.println("b6 = " + b6); //es falso

      boolean b7 = i<j;
        System.out.println("b7 = " + b7); // es true
        boolean b8 = l>= k;
        System.out.println("b8 = " + b8); //es true

        boolean b9 = l <= k;
        System.out.println("b9 = " + b9); //es false.


    }
}
