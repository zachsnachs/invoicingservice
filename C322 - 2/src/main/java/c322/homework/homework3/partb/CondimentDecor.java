package c322.homework.homework3.partb;

public abstract class CondimentDecor extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}

class SteamedMilk extends CondimentDecor{


    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();

    }
    @Override
    public String getDescription() {
        description = "Milk";
        return beverage.getDescription() + " and "+ description;
    }
}
class Mocha extends CondimentDecor{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        description = "Mocha";
        return beverage.getDescription() + " and "+ description;
    }
}
class Whip extends CondimentDecor{
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        description = "Whip";
        return beverage.getDescription() + " and "+ description;
    }
}

class Soy extends CondimentDecor{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .40 + beverage.cost();
    }

    @Override
    public String getDescription() {
        description = "Soy";
        return beverage.getDescription() + " and "+ description;
    }
}