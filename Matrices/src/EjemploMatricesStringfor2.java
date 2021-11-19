public class EjemploMatricesStringfor2 {
    public static void main(String[] args) {
        String [][] nombres = {{"pepe", "pepa"},{"Josefa", "paco"},{"Lucas", "Pancha"}};



        System.out.println("Iterando con foreach");

        for (String[] fila: nombres ) {
            for (String nombre: fila ) {
                System.out.println(nombre + " \t" );
            }
            System.out.println();
        }

    }
}
