package c322.homework.homework3.partc;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
