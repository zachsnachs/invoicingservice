package c322.homework.homework2;
import java.util.Random;

public class WeatherStation {
    // We need to generate the actual weahter data here
    float tempLimit = 100;
    double humLimit = 100.0;
    int lbPress = 100;
    int upPress = 950;

    Random randPress = new Random();
    Random randTemp = new Random();
    Random randHumid = new Random();
    float useRandTemp = randTemp.nextFloat(tempLimit);
    double useRandHum = randHumid.nextDouble(humLimit);
    int useRandPress = randPress.nextInt(upPress ) + lbPress;

}
