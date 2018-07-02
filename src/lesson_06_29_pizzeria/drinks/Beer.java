package lesson_06_29_pizzeria.drinks;

public class Beer implements Drink {
    private String rusis;
    private double kaina;

    public Beer(String rusis) {
        this.rusis = rusis;

        if (rusis == ("light")) {
            this.kaina = 3;
        } else if (rusis == "black") {
            this.kaina = 3.5;
        } else if (rusis == "white") {
            this.kaina = 3.3;
        } else {
            this.kaina = 0;
        }
    }

    public double getKaina() {
        return kaina;
    }

//    @Override
//    public Drink order(Drink drink) {
//       return drink;
//    }
}