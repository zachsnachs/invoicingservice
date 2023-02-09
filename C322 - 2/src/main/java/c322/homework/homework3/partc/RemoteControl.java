package c322.homework.homework3.partc;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        // Lambda functions seem to make this less tedious

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand= noCommand;
    }

    public void onPush(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offPush(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    void undoButtonPush(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n === Dynamic Programmable Remote Control ===\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }


}
