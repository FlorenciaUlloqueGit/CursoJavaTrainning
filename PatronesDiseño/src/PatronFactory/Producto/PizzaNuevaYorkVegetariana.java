package PatronFactory.Producto;

public class PizzaNuevaYorkVegetariana extends PizzaProducto {

    public PizzaNuevaYorkVegetariana() {
        super();
        nombre = "Pizza veggie";
        masa = "a la piedra";
        salsa= "tomate";
        ingredientes.add("queso vegano");
        ingredientes.add("tomate");
        ingredientes.add("aceitunas");
        ingredientes.add("espinacas");
        ingredientes.add("berejenas");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando x 20min a 150°");
    }

    @Override
    public void cortar() {
        System.out.println("cortando el 8 porciones triangulares");

    }
}
