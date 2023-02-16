package c322.labs.lab5;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Quarter inserted . . .");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("There isn't a quarter to return");
    }

    public void turnCrank() {
        System.out.println("No quarter inserted");
    }

    public void dispense() {
        System.out.println("First pay");
    }

    public void refill() { }

    public String toString() {
        return "waiting for a quarter";
    }
}