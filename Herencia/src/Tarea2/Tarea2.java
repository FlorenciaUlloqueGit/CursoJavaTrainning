package Tarea2;

public class Tarea2 {
    public static void main(String[] args) {
        Producto [] prod = new Producto[2];
       Lacteo leche = new Lacteo("leche entera", 120, 3, 40);
       Limpieza lim = new Limpieza("lavandina", 250, "desegrasante", 1.5);
       prod[0] = leche;
       prod[1] = lim;
        for (int i = 0; i < prod.length; i++) {
            System.out.println(prod[i]);
            System.out.println();
        }



    }
}
