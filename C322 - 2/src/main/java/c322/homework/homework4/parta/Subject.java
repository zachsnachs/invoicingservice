package c322.homework.homework4.parta;

public interface Subject {


    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
