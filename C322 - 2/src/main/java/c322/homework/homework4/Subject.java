package c322.homework.homework4;

import c322.homework.homework2.Obv;

public interface Subject {


    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
