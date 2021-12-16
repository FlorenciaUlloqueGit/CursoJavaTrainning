package PatronFactory.Producto;

public class PizzaNYItaliana extends PizzaProducto {

    public PizzaNYItaliana() {
        super();
        nombre = "pizza italiana NY";
        masa= "masa gruesa";
        salsa =  " tomate y cebolla";
        ingredientes.add("queso mozzarella");
        ingredientes.add("aceitunas");
        ingredientes.add("jamon");
        ingredientes.add("champignones");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando 25 min a 120 °");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en triángulos");

    }
}
