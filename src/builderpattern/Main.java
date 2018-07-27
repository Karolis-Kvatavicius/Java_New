package builderpattern;

public class Main {

    private static final int QUANTITY = 10;

    public static void main(String[] args) {

        luckyTicketsForThisWeek();

    }

    private static void luckyTicketsForThisWeek() {
        for (int i = 0; i < QUANTITY; i++) {
            new NumberBuilder().build().luckyTicketForPrize();
        }
    }
}