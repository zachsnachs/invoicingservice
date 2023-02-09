package c322.lab.lab5.parta;

public class Light {

    // Add location????

    String location = "";
    public Light(String location){
        this.location = location;

    }

    void on(){
        System.out.println("Now turning on your light: " + location);
    }

    void off(){
        System.out.println ("Now turning off the lights. . . \n Goodnight: " + location);
    }
}
