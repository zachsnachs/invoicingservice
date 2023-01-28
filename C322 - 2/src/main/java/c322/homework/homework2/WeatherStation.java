package c322.homework.homework2;

import java.util.Random;

public class WeatherStation {

    public static void main(String[] args) {
        float randTemp, randHumid, randPress;
        Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        float upperbound = 100;
        randTemp = rand.nextFloat(upperbound);
        randHumid = rand2.nextFloat(upperbound);
        randPress = rand3.nextFloat(upperbound);

        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay currDisplay = new CurrentConditionsDisplay(wd);
        ForecastDisplay forDisplay = new ForecastDisplay(wd);
        StatisticsDisplay statDisplay = new StatisticsDisplay(wd);


            wd.setMeasurements(76, 34, 75);
            wd.setMeasurements(11, 23, 50);
            wd.setMeasurements(randTemp, randHumid, randPress);
    }

}
