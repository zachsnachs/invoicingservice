package c322.homework.homework5.partb;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
  Command command;
  Command[] onCommands;
  Command[] offCommands;

  public Invoker(){
    onCommands = new Command[7];
    offCommands = new Command[7];

    for (int i = 0; i < 7; i++) {
      onCommands[i] = () -> { };
      offCommands[i] = () -> { };
    }
  }

    void setCommand(Command command){
      this.command = command;
    }

    void executor(){
      command.execute();
    }
}