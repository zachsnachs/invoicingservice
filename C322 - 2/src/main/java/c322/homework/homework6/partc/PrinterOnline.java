package c322.homework.homework6.partc;

public class PrinterOnline implements PrinterState{
    Printer printer;

    public PrinterOnline(Printer printer) {
        this.printer = printer;

    }

    @Override
    public void pushPrint() {
        if (printer.getState() == printer.printerOffline) {
            printer.setState(printer.printerOnline);
            System.out.println("Booting up the system, please wait . . . ");
        } else{
            System.out.println("System is already on . . .");
        }
        if (printer.getJob() == true){
            System.out.println("Currently processing another job, " +
                    "you must wait to add another to the queue . . .");
        }else{
            printer.startJob();
            System.out.println("Adding a job to the queue now . . .");
        }
    }

    public String toString() {
        return "The printer is on and working . . .";
    }

}
