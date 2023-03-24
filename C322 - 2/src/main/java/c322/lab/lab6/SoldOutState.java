package c322.lab.lab6;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    @Override
    public void refill() {

    }

        public String toString(){
        return "Outta gumballs, son";
    }
}
