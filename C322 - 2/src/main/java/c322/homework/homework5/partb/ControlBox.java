package c322.homework.homework5.partb;

public class ControlBox {

    public static final int SLIDER_MIN = 0, SLIDER_MAX = 100;
    int sliderValue = 0;
    boolean poweredOn = false;

    public ControlBox(){}

    void powerOn() {
        System.out.println("Device turned on");
        poweredOn = true;

    }

    void powerOff() {
        System.out.println("Device turned off");
        poweredOn = false;
    }

    void hasPower() {
        if (poweredOn == true) {
            System.out.println("System has power . . .");
        } else {
            System.out.println("The system isn't powered . . .");
        }
    }

    public void sliderIncrease(int newSliderValue) {
        if (newSliderValue > SLIDER_MAX || newSliderValue < SLIDER_MIN) {
            System.out.println("The slider value is out of bounds. Try " +
                    "a value between 0 and 100 . . .");
        } else if (newSliderValue < sliderValue) {
            System.out.println("You can only increase the volume" +
                    "with this method !");
        } else {
            sliderValue = newSliderValue;

            System.out.println("New value set to : " + sliderValue);

        }

    }
}