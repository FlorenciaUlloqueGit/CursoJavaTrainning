package PatronDecorator.Decorator2.Decoradores;

import PatronDecorator.Decorator2.Configurable;

public abstract class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
