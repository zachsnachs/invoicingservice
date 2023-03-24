package c322.homework.homework4.partb;

import java.io.*;
import java.util.Arrays;

public abstract class Printer {

    public Printer(String text){
        this.buffer = text;

    }
    String buffer = new String  ("Body");

    byte[] b = buffer.getBytes();

    public byte[] flushBuffer(){

        return b;
    }

}
