package c322.labs.lab4.parta;

public class ForecastDisplay implements Obv, DisplayMaker {
    private float temp, humid, press;
    private float currPress = 30.01f;
    private float lastPress;
    private float currHumid = 50.0f;
    private float lastHumid;
    private WeatherData weatherdata;

    public ForecastDisplay(WeatherData weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerObv((Obv) this);
    }


     public void update(float temp, float humid, float press) {
        lastPress = currPress;
        currPress = press;
        lastHumid = currHumid;
        currHumid = temp;
        display();
    }

    public void display(){
        System.out.print("Here's our forecast for today: ");

        if (currPress == lastPress){
            System.out.println("The weather appears stable, expect things to continue for better or worse");

        } else if (currPress > lastPress){
            System.out.println("Expect better weather coming your way! Grab those picnic baskets! ");

        } else if (currPress < lastPress){
            System.out.println("Weather will be cooler, and potentially rainy");
        }
        if (currHumid > lastHumid ){

            System.out.println("Looks like we're hitting Florida levels of humidity out there !");
        }else if (currHumid < lastHumid){

            System.out.println("Humidity is going down. Consider turning on those nightly humidifiers!");

        }else if (currHumid == lastHumid){
            System.out.println("Humidity is looking to be about the same level as it wa before . . . ");
        }
    }
}