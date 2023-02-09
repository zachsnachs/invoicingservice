package c322.homework.homework3.partc;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }

    @Override
    public void undo() {

    }
}