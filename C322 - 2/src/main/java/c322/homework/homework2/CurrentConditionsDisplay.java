package c322.homework.homework2;

public class CurrentConditionsDisplay implements Obv, DisplayMaker {

        private float temp, humid, press;
        private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
            this.weatherData = weatherData;
            weatherData.registerObv((Obv) this);
        }

        public void update ( float temp, float humid, float press){
            this.temp = temp;
            this.humid = humid;
            display();
        }

        public void display () {
            System.out.println("Current conditions: " + temp + "F degrees and " + humid + "% humidity");
        }
    }

