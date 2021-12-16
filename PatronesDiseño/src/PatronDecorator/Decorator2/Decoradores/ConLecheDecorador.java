package PatronDecorator.Decorator2.Decoradores;

import PatronDecorator.Decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador {
    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", leche";
    }

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

}
