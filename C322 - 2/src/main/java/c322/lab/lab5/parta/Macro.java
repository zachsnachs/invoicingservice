package c322.lab.lab5.parta;

public class Macro implements Command{
    Command[] commands;

    public Macro(Command[] commands){
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }

    }
}
