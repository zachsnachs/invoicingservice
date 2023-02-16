package c322.lab.lab6;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You've already inserted a quarter. No need to give us another one!");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You've already turned the crank. If you would like a refund, contact" +
                "customer support at bigGGumballs(dot)com");

    }

    @Override
    public void turnCrank() {
        System.out.println("You've already turned once, no need to turn again.");

    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "Churning out gumball";

    }
}

