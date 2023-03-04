package c322.homework.homework7.parta;

public class TestDrive {
    public static void main(String[] args) {
        TV tv = new TV();
        State On = new TVOnState();
        State Off = new TVOffState();

        tv.setState(Off);

        tv.pressSwitch();
        tv.setState(On);

        tv.pressSwitch();
    }


}
