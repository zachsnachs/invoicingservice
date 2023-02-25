package c322.homework.homework6.partc;

public class Printer {

    PrinterState printerOffline;
    PrinterState printerOnline;
    PrinterState state = printerOffline;

    boolean hasJob = false;

    public Printer() {
        printerOnline = new PrinterOnline(this);
        printerOffline = new PrinterOffline(this);
        state = printerOffline;
    }

    public void pushPrint(){
        state.pushPrint();

    }

    void startJob(){
        System.out.println("We're adding a job to the queue");
        hasJob = true;
    }

    void endJob(){
        System.out.println("We're ending the job, feel free to add another");
        hasJob = false;
    }

    boolean getJob(){
        return hasJob;
    }


    void setState(PrinterState state) {
            this.state = state;
    }

    public PrinterState getState(){
        return state;
    }


    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nPrinter Application");
        result.append("\n. . . ");
        return result.toString();
    }

}