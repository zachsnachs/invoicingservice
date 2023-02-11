package c322.homework.homework4.partb;

public class Footer extends Decorator {

    String fMessage;
    byte[] fMessageBytes;
    public Footer (Printer printer, String text){
        super("");
        fMessage = text;
        this.printer = printer;
        fMessageBytes = fMessage.getBytes();

    }

    @Override
    public byte[] flushBuffer() {
        int flushLength = printer.flushBuffer().length;
        byte[] largerArrayHeader = new byte[fMessage.length() + flushLength ];
        System.arraycopy(fMessageBytes, 0, largerArrayHeader, flushLength, fMessage.length());
        System.arraycopy(printer.flushBuffer(), 0, largerArrayHeader, 0, flushLength);

        return largerArrayHeader ;
    }

    // We don't need flushBuffer
}