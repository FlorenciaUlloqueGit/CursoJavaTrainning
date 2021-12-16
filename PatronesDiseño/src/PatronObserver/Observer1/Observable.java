package PatronObserver.Observer1;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observadores = new ArrayList<>();

    public void addObserver(Observer observer){
        observadores.add(observer);
    }
    public void remove (Observer observer){
        observadores.remove(observer);
    }

    public void notificarObservadores(){
        for(Observer o : observadores){
            o.actualizar(this);
        }
    }

}
