package c322.lab.lab5.parta;

import java.util.Scanner;

public class Stereo {
    String location = "";
    public Stereo(String location){
        this.location = location;
    }

    void on(){
        System.out.println("Welcome, booting up your sound system: " + location);
    }
    void off(){
        System.out.println("Goodbye. Have a nice day" + location);
    }

    void spotifyOn(){
        System.out.println("Spotify is now on" + location);
    }

    void spotifyOff(){
        System.out.println("Spotify is now off " + location);
    }
/*
    void volume(){}
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter new volume: ");
    String volume = myObj.nextLine();  // Read user input
    System.out.println("New Volume: " + volume);

 */
}
