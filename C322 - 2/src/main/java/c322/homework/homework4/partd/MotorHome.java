package c322.homework.homework4.partd;

import java.util.ArrayList;

public abstract class MotorHome {

    String name;
    Style style;
    Frame frame;
    Engine engine;
    Kitchen kitchen;


  abstract void produce();
    void setName(String name) {

        this.name = name;
    }

    String getName() {

        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(" . . . . " + name + " . . .\n");
        if (frame != null) {
            result.append(frame);
            result.append("\n");
        }
        if (style != null) {
            result.append(style);
            result.append("\n");
        }
        if (engine != null) {
            result.append(engine);
            result.append("\n");
        }
        if (kitchen != null) {
            result.append(kitchen);
            result.append("\n");
        }
        return result.toString();
    }

    }
