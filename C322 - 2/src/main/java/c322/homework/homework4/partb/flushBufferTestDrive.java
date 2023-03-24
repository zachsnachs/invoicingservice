package c322.homework.homework4.partb;

import java.util.Arrays;
import java.io.*;

public class flushBufferTestDrive {
    public static void main(String[] args) {
        Printer printer = new Body();
        printer = new Header(printer, "New headers");
        printer = new Footer(printer, "wow footers");
        String s = new String(printer.flushBuffer());
        System.out.println(s);
    }
}
