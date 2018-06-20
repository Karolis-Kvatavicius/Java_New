package pvm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.math.BigDecimal.valueOf;

public class Vat {
    public static void main(String args[]) {

        BigDecimal sum = new BigDecimal("200");
        printReceipt(4, sum);

    }

    private static void printReceipt(int quantity, BigDecimal totalAmount) {


        BigDecimal pcsPrice = totalAmount.setScale(4).divide(valueOf(121), RoundingMode.HALF_UP).multiply(valueOf(100).divide(valueOf(quantity)));

        BigDecimal sumWithoutVat = totalAmount.setScale(4).divide(valueOf(121), RoundingMode.HALF_UP).multiply(valueOf(100));

        BigDecimal vat = totalAmount.setScale(2, RoundingMode.HALF_UP).subtract(sumWithoutVat);


        System.out.println("\n" + String.format("Vieneto kaina be PVM: %.2f €", pcsPrice));
        System.out.println("Kiekis: " + quantity + " vnt");
        System.out.println(String.format("Suma be PVM: %.2f €", sumWithoutVat));
        System.out.println(String.format("PVM suma: %.2f €", vat));
        System.out.println(String.format("Viso suma su PVM: %.2f €", totalAmount));
    }
}
