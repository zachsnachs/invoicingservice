package c322.lab.lab6;

public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("That's generous of you, but my programmer overlords" +
                "told me I can't accepts tips so . . . " );
    }

    public void ejectQuarter() {
        System.out.println("Be patient. I'm getting you one. . .");
    }

    public void turnCrank() {
        System.out.println("Stop being greedy!");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("You won, receive two gumballs");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("No more gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public void refill() { }

    public String toString() {
        return "Winner winner gumball dinner !";
    }
}
