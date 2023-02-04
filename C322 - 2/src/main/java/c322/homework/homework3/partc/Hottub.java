package c322.homework.homework3.partc;

public class Hottub {
    boolean on;
    int temp;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on) {
            System.out.println("Hottub is bubbling!");
        }
    }

    public void bubblesOff() {
        if (on) {
            System.out.println("Hottub is not bubbling");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("Hottub jets are on");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("Hottub jets are off");
        }
    }

    public void setTemperature(int temp) {
        this.temp = temp;
    }

    public void heat() {
        temp = 125;
        System.out.println("Caution: Maximum safe heat limit reached");
    }

    public void cool() {
        temp = 98;
        System.out.println("Reached low temp of 90 degrees . . . ");
    }

}