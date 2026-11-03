package Observer.DiferentesObservadores;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    private List<Observer> observers = new ArrayList<>();
    private int State;

    public int getState(){
        return this.State;
    }

    public  void setState(int state){
        this.State = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

     public void detach(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
