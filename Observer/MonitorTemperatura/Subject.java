package Observer.MonitorTemperatura;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observadores = new ArrayList<Observer>();
    private int Temperatura;

    public int getTemperatura(){
        return this.Temperatura;
    }

    public void setTemperatura(int temperatura){
        this.Temperatura = temperatura;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        this.observadores.add(observer);
    }

    public void detach(Observer observer){
        this.observadores.remove(observer);
    }

    public void notifyAllObservers() {
    for (Observer observer : observadores) {
        observer.update();
    }
}
}
