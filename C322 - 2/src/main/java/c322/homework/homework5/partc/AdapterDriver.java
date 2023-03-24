package c322.homework.homework5.partc;
import java.text.DecimalFormat;

public class AdapterDriver {

    private static DecimalFormat acreageFormat = new DecimalFormat(".##");
    public static void main(String[] args) {
        LotInterface lotInterface = new Lot(6000, 5000);
        EstateInterface estateInterface = new Estate(300, 400);
        LotInterface estateAdapter = new EstateAdapter(estateInterface);

     estateInterface.getAcreage(2300, 6325);
    }


}

