public interface QuackBehavior {
    public void quackLab();
}

class noQuack implements QuackBehavior{
    public void quackLab(){
        System.out.println(" . . . ");

    }

}

class Quack implements QuackBehavior{
    public void quackLab(){
        System.out.println("Quack!");
    }
}

class Squeak implements QuackBehavior{
    public void quackLab(){
        System.out.println("Squeak ! ! ! ");
    }
}


