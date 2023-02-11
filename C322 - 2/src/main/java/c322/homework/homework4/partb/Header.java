package c322.homework.homework4.partb;



public class Header extends Decorator {
    String hMessage;
    byte[] hMessageBytes;


    public Header(Printer printer, String text){
        super("");
        this.printer = printer;
        hMessage = text;
        hMessageBytes = hMessage.getBytes();

}



 @Override
    public byte[] flushBuffer() {
        int flushLength = printer.flushBuffer().length;
        byte[] largerArrayHeader = new byte[hMessage.length() + flushLength ];
        System.arraycopy(hMessageBytes, 0, largerArrayHeader, 0, hMessage.length());
        System.arraycopy(printer.flushBuffer(), 0, largerArrayHeader, hMessage.length(), flushLength);

        return largerArrayHeader ;
    }
}
