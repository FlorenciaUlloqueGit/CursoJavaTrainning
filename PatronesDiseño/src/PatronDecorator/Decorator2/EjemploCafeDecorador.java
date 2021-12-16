package PatronDecorator.Decorator2;

import PatronDecorator.Decorator2.Decoradores.ConChocolateDecorador;
import PatronDecorator.Decorator2.Decoradores.ConCremaDecorador;
import PatronDecorator.Decorator2.Decoradores.ConLecheDecorador;

import java.io.ObjectInputFilter;

public class EjemploCafeDecorador {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(10f, "Cafe mocka");

        ConChocolateDecorador conChocolate = new ConChocolateDecorador(cafe);
        ConCremaDecorador conCrema = new ConCremaDecorador(conChocolate);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);

        System.out.println("El precio del cafe mocka es: $" + conLeche.getPrecioBase());
        System.out.println("Los ingredientes que contiene el cafe mocka son " + conLeche.getIngredientes());


        Configurable capuchino = new Cafe(4, "cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);

        System.out.println("El precio del capuchino es igual a $" + conLeche.getPrecioBase());
        System.out.println("Los ingredientes son: " + conLeche.getIngredientes());


        Configurable expresso = new Cafe(3, "Expresso");

        System.out.println("el precio del expreso es igual a " + expresso.getPrecioBase());
        System.out.println("Los ingredientes son: " + expresso.getIngredientes());

    }
}
