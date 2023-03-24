package c322.homework.homework4.partb;
import java.util.Arrays;
public abstract class Decorator extends Printer{
    Printer printer;

    public Decorator(String text) {
        super(text);
    }

    public abstract byte[] flushBuffer();
}
