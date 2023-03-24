package c322.labs.lab4.partc;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("pepperoni");
        System.out.println("Ordered: " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("clam");
        System.out.println("Ordered: " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("cheese");
        System.out.println("Ordered: " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("Ordered: " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}