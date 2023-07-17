package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer );
        notifyObserver("增加了一个观察者");
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
        notifyObserver("删除一个观察者");
    }

    /*
    通知
     */
    public void notifyObserver(String msg){
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
