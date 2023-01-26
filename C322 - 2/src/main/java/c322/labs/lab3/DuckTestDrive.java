import java.awt.*;

public class DuckTestDrive {
    public static void main(String[] args) {

        /*
         Mallard m = new Mallard();
         m.swim();
         m.quack();
         m.display();

        Redhead r = new Redhead();
         r.swim();
         r.quack();
         r.display();
         */

        // . . . All of this seems really inefficient ~

        // So obviously using the array is a much better way of instantiating the subclass objects!

        Duck[] ducks = new Duck[8];
        ducks[0] = new Mallard();
        ducks[1] = new Redhead();
        ducks[2] = new Alabio();
        ducks[3] = new Domestic();
        ducks[4] = new Canvasback();
        ducks[5] = new Whistling();
        ducks[6] = new Rubber();
        ducks[7] = new Decoy();

        // And this for loop lets us use the shared methods for every subclass without tons of bloat

        for (Duck duck : ducks) {
            duck.swim();
            duck.quack();
            duck.display();
            duck.flying();

        }

        System.out.println("This is where the actual lab stuff starts !!!!!!!! \n \n \n");
        Duck mallardLab = new Mallard();
        mallardLab.performFly();
        mallardLab.performQuack();

        Duck rubberLab = new Rubber();
        rubberLab.performFly();
        rubberLab.performQuack();

        Duck decoyLab = new Decoy();
        decoyLab.performQuack();
        decoyLab.performFly();
    }
}