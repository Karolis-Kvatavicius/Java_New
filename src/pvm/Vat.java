package pvm;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vat {
    public static void main(String args[]) {

        BigDecimal sum = new BigDecimal("200");
        printReceipt(4, sum);

    }

    private static void printReceipt(int quantity, BigDecimal totalAmount) {

        BigDecimal totalAmountRounded = totalAmount.setScale(2, RoundingMode.HALF_UP);

        double pcsPrice = ((totalAmount.doubleValue() / 121 * 100) / quantity);
        BigDecimal pcsPriceRounded = new BigDecimal(pcsPrice);
        pcsPriceRounded = pcsPriceRounded.setScale(2, RoundingMode.HALF_UP);


        double sumWithoutVat = (totalAmount.doubleValue() / 121 * 100);
        BigDecimal sumWithoutVatRounded = new BigDecimal(sumWithoutVat);
        sumWithoutVatRounded = sumWithoutVatRounded.setScale(2, RoundingMode.HALF_UP);

        double vat = totalAmount.doubleValue() - sumWithoutVat;
        BigDecimal vatRounded = new BigDecimal(vat);
        vatRounded = vatRounded.setScale(2, RoundingMode.HALF_UP);

        System.out.println("\nVieneto kaina be PVM: " + pcsPriceRounded);
        System.out.println("Kiekis: " + quantity);
        System.out.println("Suma be PVM: " + sumWithoutVatRounded);
        System.out.println("PVM suma: " + vatRounded);
        System.out.println("Viso suma su PVM: " + totalAmountRounded);
    }
}
