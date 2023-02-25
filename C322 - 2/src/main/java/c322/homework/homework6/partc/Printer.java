package c322.homework.homework6.partc;

public class Printer {

    PrinterState printerOffline;
    PrinterState printerOnline;
    PrinterState state = printerOffline;

    boolean hasJob = false;

    public Printer() {
        printerOnline = new PrinterOnline(this);
    }

    void setState(PrinterState state) {
            this.state = state;
    }

    public PrinterState getState(){
        return state;
    }

    boolean getJob(){
        return hasJob;
    }


}