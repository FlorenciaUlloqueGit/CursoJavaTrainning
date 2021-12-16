package PatronFactory.Producto;

public class PizzaNuevaYorkPeperoni  extends PizzaProducto {

    public PizzaNuevaYorkPeperoni() {
        super();
        nombre = "pizza peperoni NY";
        masa= "italiana";
        salsa = "tomate";
        ingredientes.add("queso mozzarella");
        ingredientes.add("extra peperoni");
        ingredientes.add("aceitunas");

    }

    @Override
    public void cocinar() {
        System.out.println("cocinando 40' a 90°");
    }

    @Override
    public void cortar() {

        System.out.println("cortando la pizza en rebanadas rectangulares");
    }
}
