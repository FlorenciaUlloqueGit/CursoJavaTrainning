package PatronFactory.Factory;

import PatronFactory.Producto.PizzaCaliforniaPeperoni;
import PatronFactory.Producto.PizzaCaliforniaQueso;
import PatronFactory.Producto.PizzaCaliforniaVegetariana;
import PatronFactory.Producto.PizzaProducto;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "Peperoni":
                producto = new PizzaCaliforniaPeperoni();
                break;
            case "veggie":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
