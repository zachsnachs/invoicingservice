package c322.homework.homework3.partb;

public abstract class Beverage {
    String description = "Not a real beverage";
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}

class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "A strong roast, highly caffeinated.";
    }

    @Override
    public double cost() {
        return 4.99;
    }
}

class Espresso extends Beverage{
    public Espresso (){
        description = "A strong shot of coffee";
    }

    public double cost(){
        return 3.99;
    }
}

class HouseBlend extends Beverage{
    public HouseBlend (){
        description = "A medium roast, mellow flavors";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}

class Decaf extends Beverage{
    public Decaf (){
        description = "This coffee has no caffeine!";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}