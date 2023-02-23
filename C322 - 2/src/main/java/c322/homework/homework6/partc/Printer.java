package c322.homework.homework6.partc;

public class Printer {
    PrinterState printerOnline;
    PrinterState printerOffline;

    public Printer(){
        printerOnline = new PrinterOnline(this);
    }
}
