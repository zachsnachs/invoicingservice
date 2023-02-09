package c322.homework.homework3.partc;


public class TV {
    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println("Set to Netflix");
    }

    public void setInputChannelSpot() {
        this.channel = 4;
        System.out.println("Opening Spotify");
    }
}
