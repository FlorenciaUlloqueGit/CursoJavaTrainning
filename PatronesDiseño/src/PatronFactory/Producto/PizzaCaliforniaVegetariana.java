package PatronFactory.Producto;

public class PizzaCaliforniaVegetariana  extends PizzaProducto{
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180° ");
    }

    @Override
    public void cortar() {

        System.out.println("cortando en rectangulos");
    }

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza calif vegetariana";
        masa= "delgada light";
        salsa = "barbacoa light";
        ingredientes.add("queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("cebollas");
        ingredientes.add("berenjena");

    }
}
