package PatronObserver.Observer1;

import PatronObserver.Observer1.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);

        google.addObserver(observable -> {
            System.out.println("John: " +  observable);
        } );
        google.addObserver(observable -> {
            System.out.println("Flor: " + observable );
        } );
        google.addObserver(observable -> {
            System.out.println("Martin: " + observable );
        } );

        google.modificarPrecio(2000);
    }
}
