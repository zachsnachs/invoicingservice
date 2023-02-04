package c322.homework.homework4;

import java.util.ArrayList;
import java.util.List;

public class Forum implements Subject {
    private List<Observer> observers;
    private String name, header, body;

    public Forum (){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
            observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(name, header, body);
        }
    }
    public void forumChanged(){
        notifyObserver();
    }

    public void setForum()
}
