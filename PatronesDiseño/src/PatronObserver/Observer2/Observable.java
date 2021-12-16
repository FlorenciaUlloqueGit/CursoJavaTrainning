package PatronObserver.Observer2;

import PatronObserver.Observer2.Observer;

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
      notificarObservadores(null);
    }
    public void notificarObservadores(Object objeto){
        for(Observer o : observadores){
            o.actualizar(this, objeto);
        }

    }

}
