package c322.homework.homework3.partc;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;


    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        // Lambda functions seem to make this less tedious

        for (int i = 0; i < 2; i++) {
            onCommands[i] = () -> {};
            offCommands[i] = () -> {};
        }
    }

    public void onPush(int slot){
        onCommands[slot].execute();;
    }

    public void offPush(int slot){
        offCommands[slot].execute();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
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
