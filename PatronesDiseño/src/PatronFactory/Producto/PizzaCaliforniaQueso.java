package PatronFactory.Producto;

public class PizzaCaliforniaQueso  extends PizzaProducto{
    @Override
    public void cocinar() {

        System.out.println("cocinando 35 min a 100°");
    }

    @Override
    public void cortar() {
        System.out.println("cortando la pizza en pequeños triangulos ");

    }

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza california queso";
        masa = "Masa a la piedra delgada";
        salsa= "tomate con rucula";
        ingredientes.add("extra queso ");
        ingredientes.add("cebolla");
        ingredientes.add("queso azul");

    }
}
