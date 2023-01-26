package c322.homework.homework2;
import java.util.Random;

public class WeatherData {
    float tempLimit = 100;
    double humLimit = 100.0;
    int lbPress = 100;
    int upPress = 950;

    Random randPress = new Random();
    Random randTemp = new Random();
    Random randHumid = new Random();
    float useRandTemp = randTemp.nextFloat(tempLimit);
    double useRandHum = randHumid.nextDouble(humLimit);
    int useRandPress = randPress.nextInt(upPress) + lbPress;

    // These are getter methods that need to be implemented
    public float getTemperature() {
        return useRandTemp;
    }

    public double getHumidity() {
        return useRandHum;
    }

    public int getPressure() {
        return useRandPress;
    }

    public void measurementsChanged() {

    }

    public void setMeasurements(float useRandTemp, double useRandHum, int useRandPress) {
        this.useRandHum = useRandHum;
        this.useRandTemp = useRandTemp;
        this.useRandPress = useRandPress;

    }
}


