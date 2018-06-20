package pvm;

import java.math.BigDecimal;

public class Pvm {
    public static void main(String args[]) {
//        BigDecimal totalAmount = new BigDecimal(125);
        printReceipt(4, 200);
    }

    private static void printReceipt(int quantity, double totalAmount) {

        System.out.println("\nVieneto kaina be PVM: " + (double) Math.round(((totalAmount / 121 * 100) / quantity) * 100) / 100);
        System.out.println("Kiekis: " + quantity);
        System.out.println("Suma be PVM: " + (double) Math.round((totalAmount / 121 * 100) * 100) / 100);
        System.out.println("PVM suma: " + (double) Math.round((totalAmount - (totalAmount / 121 * 100)) *100) / 100);
        System.out.println("Viso suma su PVM: " + (double) Math.round(totalAmount *100) / 100);
    }
}
