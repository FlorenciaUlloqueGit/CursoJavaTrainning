package PatronFactory.Factory.Ejemplo;

import PatronFactory.Factory.FabricaConcretaNuevaYork;
import PatronFactory.Factory.PizzeriaCaliforniaFactory;
import PatronFactory.Factory.PizzeriaZonaAbstractFactory;
import PatronFactory.Producto.PizzaProducto;

public class EjemploFactoryMain {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new FabricaConcretaNuevaYork();
        PizzeriaZonaAbstractFactory cal = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = cal.ordenarPizza("queso");
        System.out.println("bruce ordena la pizza " + pizza.getNombre());

        System.out.println("=============================================");

        pizza = ny.ordenarPizza("peperoni");
        System.out.println("andres ordena una " + pizza.getNombre());
        System.out.println("=============================================");

        pizza = cal.ordenarPizza("veggie");
        System.out.println("florencia ordena una pizza " + pizza.getNombre());
        System.out.println("=============================================");
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Carlos ordena una pizza " + pizza.getNombre());
        System.out.println("=============================================");
        System.out.println("pizza = " + pizza);
    }
}
