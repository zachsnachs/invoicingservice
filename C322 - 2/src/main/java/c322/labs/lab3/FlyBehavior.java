public interface FlyBehavior {
    public void flyLab ();
}

    class Flywithwings implements FlyBehavior{
    public void flyLab() {
        System.out.println("I'm flying!");
    }
}

    class FlyNoway implements FlyBehavior {
        public void flyLab() {

            System.out.println("I can't fly tbh");
        }
    }
