package c322.homework.homework6.partc;

public class PrinterOffline implements PrinterState{

    Printer printer;

    public PrinterOffline(Printer printer) {
        this.printer = printer;

    }
    @Override
    public void pushPrint() {
        if (printer.getState() == printer.printerOnline) {
            printer.setState(printer.printerOffline);
            System.out.println("Turning off the system . . . ");
        } else{
            System.out.println("System is already off . . .");
        }
        if (printer.getJob() == true){
            System.out.println("Ending the job . . . ");
            printer.endJob();
        }
    }

    public String toString() {
        return "The printer is currently off . . . ";
    }

}
