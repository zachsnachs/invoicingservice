package c322.labs.lab4.parta;

public class StatisticsDisplay implements Obv, DisplayMaker {
    private float maxTemp = 0.0f, minTemp = 100.0f, sum = 0.0f;
    private int num;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObv(this);

    }
    @Override
    public void display() {
        System.out.println("Average temp: " + " " + (sum / num) + " " + "Max temp: " + " " + maxTemp + " " + "Min temp: "
                + " " +  minTemp );

    }

    @Override
    public void update(float temp, float humid, float press) {
        sum += temp;
        num += 1;

        if (temp > maxTemp){
            maxTemp = temp;
        }
        if (temp < minTemp){
            minTemp = temp;
        }
        display();
    }
}
