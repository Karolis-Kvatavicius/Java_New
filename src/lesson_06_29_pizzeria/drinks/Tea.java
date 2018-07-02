package lesson_06_29_pizzeria.drinks;

public class Tea implements Drink {

    private boolean sugar;
    private boolean honey;
private double kaina;

    public Tea(boolean sugar, boolean honey) {
        this.sugar = sugar;
        this.honey = honey;
    }

    public Tea(boolean sugar, boolean honey, double kaina) {
        this.sugar = sugar;
        this.honey = honey;

        if (sugar && !honey) {
             this.kaina = 1;
        } else if (honey && !sugar) {
                 this.kaina = 2;
        } else if (sugar && honey) {
            this.kaina = 3;
        } else  {
            this.kaina = 0.5;
        }

    }

    public double getKaina() {

      return kaina; }
//
//    @Override
//    public Drink order(Drink drink) {
//        return null;
//    }
}
