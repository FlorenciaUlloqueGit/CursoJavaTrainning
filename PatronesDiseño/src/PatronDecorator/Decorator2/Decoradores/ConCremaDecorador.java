package PatronDecorator.Decorator2.Decoradores;

import PatronDecorator.Decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador{

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", crema";
    }

    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }
}
