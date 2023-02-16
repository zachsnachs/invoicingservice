package c322.homework.homework5.partc;
import java.text.DecimalFormat;

public class AdapterDriver {

    private static DecimalFormat acreageFormat = new DecimalFormat(".##");
    public static void main(String[] args) {
        LotInterface lotInterface = new Lot();
        EstateInterface estateInterface = new Estate();
        LotInterface estateAdapter = new EstateAdapter(estateInterface);

        estateInterface.getAcreage(9000 , 45000);

    }
}
