package c322.homework.homework3.partb;

public class CoffeeTestDrive {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        System.out.println(beverage.getDescription() +
                " Total cost: $" + beverage.cost());

        Beverage beverageDark = new DarkRoast();
        beverageDark = new Whip(beverageDark);
        beverageDark = new Mocha(beverageDark);
        System.out.println(beverageDark.getDescription() +
                " Total cost: $" + beverageDark.cost());

        Beverage beverageHouse = new HouseBlend();
        beverageHouse = new Whip(beverageHouse);
        beverageHouse = new Mocha(beverageHouse);
        beverageHouse = new Soy(beverageHouse);
        beverageHouse = new SteamedMilk(beverageHouse);
        System.out.println(beverageHouse.getDescription() +
                " Total cost: $" + beverageHouse.cost());


    }
}


