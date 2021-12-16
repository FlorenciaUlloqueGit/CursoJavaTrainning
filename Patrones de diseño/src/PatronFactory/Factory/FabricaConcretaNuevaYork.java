package PatronFactory.Factory;

import PatronFactory.Producto.PizzaProducto;
import PatronFactory.PizzeriaZonaAbstractFactory;
import PatronFactory.Producto.PizzaNYItaliana;
import PatronFactory.Producto.PizzaNuevaYorkPeperoni;
import PatronFactory.Producto.PizzaNuevaYorkVegetariana;

public class FabricaConcretaNuevaYork extends PizzeriaZonaAbstractFactory {





    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = switch (tipo) {
            case "vegetariana" -> new PizzaNuevaYorkVegetariana();
            case "peperoni" -> new PizzaNuevaYorkPeperoni();
            case "Italiana" -> new PizzaNYItaliana();
            default -> null;
        };
        return producto;
    }
}
