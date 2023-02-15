package c322.homework.homework5.partb;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
  Command command;

  public Invoker(){}

    void setCommand(Command command){
      this.command = command;
    }

    void executor(){
      command.execute();
    }
}