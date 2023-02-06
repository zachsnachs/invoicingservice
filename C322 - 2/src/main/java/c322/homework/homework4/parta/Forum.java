package c322.homework.homework4.parta;

import java.util.ArrayList;
import java.util.List;

public class Forum implements Subject {
    private List<Observer> observers;
    private String name;
    private String body;
    private String header;

    public Forum (){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
            observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(name, header, body);
        }
    }
    public void forumChanged(){
        notifyObserver();
    }

    public void setForum(String name, String header, String body){
        this.name = name;
        this.header = header;
        this.body = body;
        forumChanged();
    }
}
