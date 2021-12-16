package PatronFactory.Producto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {

    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "pizza peperoni California";
        masa= "italiana fina";
        salsa = "tomate con rucula picada";
        ingredientes.add("queso mozzarella");
        ingredientes.add("extra peperoni");
        ingredientes.add("aceitunas negras");

    }

    @Override
    public void cocinar() {
        System.out.println("cocinando 45' a 120°");
    }

    @Override
    public void cortar() {

        System.out.println("cortando la pizza en rebanadas triangulares grandes");
    }
}
