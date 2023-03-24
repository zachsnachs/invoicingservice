package c322.lab.lab5.parta;

public class CeilingFan {
    String location = "";
    int setting;
    private int LOW = 1, MEDIUM = 2, HIGH = 3;

    public CeilingFan(String location) {
        this.location = location;
    }

    void on(){
        System.out.println("Turning on the fan " + location);
    }
    void off(){
        System.out.println("Turning the fan off " + location);
    }

    public void high() {
        setting = HIGH;
        System.out.println(location + " ceiling fan is on high");

    }

    public void medium() {
        setting = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        setting = LOW;
        System.out.println(location + " ceiling fan is on low");
    }
}
