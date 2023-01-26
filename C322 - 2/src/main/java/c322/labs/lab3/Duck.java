import java.io.*;

/*
This code was written by Zachary Orth
University id: 200209684
Email: zorth@iu.edu
1/19/2023
 */

public abstract class Duck {

    // inherited vars to be changed by subclasses
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    protected String duckName;
    protected String duckDescriptor;

    //methods inherited

    public void performQuack(){
        quackBehavior.quackLab();
    }
    public void performFly(){
        flyBehavior.flyLab();
    }
    void swim(){
        System.out.print(duckName + " is swimming! \n");

    }
    void quack() {
        System.out.print("Quack! \n");

    }
    void display(){
        System.out.print("What we know of " + duckName + "'s physical appearance: \n" + duckDescriptor + "\n" );

    }

    void flying(){
        System.out.print(duckName + " is flying! \n \n");
    }

}

// Duck subclasses
class Mallard extends Duck {
    public Mallard() {

        duckName = "Mallard";
        duckDescriptor = "This duck has a green head.";
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }
}

class Redhead extends Duck {
    public Redhead() {

        duckName = "Redhead";
        duckDescriptor = "This duck has a red head.";
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }
}

class Alabio extends Duck {
    public Alabio() {

        duckName = "Alabio";
        duckDescriptor = "This duck is brown and beige with black spots.";
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }
}

class Domestic extends Duck {
    public Domestic() {

        duckName = "Domestic";
        duckDescriptor = "This duck is entirely white!";
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }
}

class Canvasback extends Duck {
    public Canvasback() {

        duckName = "Canvasback";
        duckDescriptor = "This duck has red eyes and a brown head.";
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }
}
class Whistling extends Duck {
    public Whistling() {

        duckName = "Whistling";
        duckDescriptor = "This duck is brown and black and has an orange bill!";
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }
}

class Rubber extends Duck {
    public Rubber() {

        duckName = "Rubber Duck";
        duckDescriptor = "This duck is yellow and make of plastic.";
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoway();
    }
}

class Decoy extends Duck {
    public Decoy() {

        duckName = "Decoy Duck";
        duckDescriptor = "This duck is plastic but otherwise looks real.";
        quackBehavior = new noQuack();
        flyBehavior = new FlyNoway();
    }

}