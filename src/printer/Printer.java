package printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public void printPagesPrinted() {
        System.out.println("Pages printed: " + pagesPrinted);
    }

    public int printPage(int pages) {
    if(pages > 0 && pages <= 100) {

       if (duplex == false && tonerLevel >= pages) {
           System.out.println( "Printing " + pages + " pages" );
           pagesPrinted += pages;
           tonerLevel -= pages;

       }
       else if (duplex == true && tonerLevel >= pages) {
           System.out.println("Duplex printer | Printing " + pages + " pages");
           pagesPrinted += pages;
           tonerLevel -= pages;
       }
       else if (tonerLevel < pages) {
           System.out.println("Printing failed. Please refill the toner.");
       }
       return 0;

    } else {
        System.out.println("Can not print this amount of pages");
    }
        return 0;
    }

    public void remainingInk() {
        System.out.println("The remaining ink level " + tonerLevel);
    }

    public int fillToner() {
        System.out.println("Filling toner");
        return tonerLevel = 100;
    }
}
