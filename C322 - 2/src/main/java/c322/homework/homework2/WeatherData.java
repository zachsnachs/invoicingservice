package c322.homework.homework2;
/*
Zachary Orth
Homework 2
C322
1 / 26 / 2023
 */
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temp, humid, press;
    private List<Obv> observers;

    // Here are all the methods we need for updating the weather, removing and adding obvs
    // etc.

    public WeatherData(){
        observers = new ArrayList<Obv>();
    }

    @Override
    public void registerObv(Obv o) {
        observers.add(o);
    }

    @Override
    public void removeObv(Obv o) {
        observers.remove(o);
    }

    @Override
    public void notifyObv() {
        for (Obv observer : observers){
            observer.update(temp, humid, press);

        }
    }
    public void measurementsChanged(){
        notifyObv();
    }
    public void setMeasurements(float temp, float humid, float press){
        this.temp = temp;
        this.humid = humid;
        this.press = press;
        measurementsChanged();
    }
}


