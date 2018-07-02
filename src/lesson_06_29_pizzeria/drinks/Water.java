package lesson_06_29_pizzeria.drinks;

public class Water implements Drink {


    private boolean still;
    private double kaina;
    private int kiekis;

    public Water(boolean still) {
        this.still = still;
        this.kiekis = kiekis;

        if (still == true) {
            this.kaina = 1;
        } else if (still == false) {
            this.kaina = 2;
          }
    }

    @Override
    public String toString() {
        return "Water{" +
                "still=" + still +

                '}';
    }
}
