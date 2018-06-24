package printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(100,  true);
        Printer printer2 = new Printer(100,  false);

        printer.printPage(1);
        printer.printPage(1);
        printer.printPage(1);
        printer.printPage( 75);
        printer.printPagesPrinted();
        printer.remainingInk();
        printer.fillToner();
        printer.remainingInk();
        printer.printPage(23);
        printer.printPagesPrinted();
        printer.remainingInk();
        printer.printPage( 77 );
        printer.remainingInk();
        printer.printPage( 2 );
        printer.remainingInk();
        printer.printPagesPrinted();
        printer.fillToner();
        printer.printPage( 1 );
        printer.printPagesPrinted();
        printer.remainingInk();

        System.out.println();
        printer2.printPage(1);
        printer2.printPage( 13 );
        printer2.printPagesPrinted();
        printer2.remainingInk();
        printer2.fillToner();
        printer2.remainingInk();
        printer2.printPage( 2 );
        printer2.printPagesPrinted();
        printer2.remainingInk();
        printer2.printPage( 100 );
        printer2.printPage( 10 );
        printer2.printPagesPrinted();
        printer2.remainingInk();
        printer2.printPage(0);
        printer2.printPage(100);
        printer2.printPage(101);
    }
}
