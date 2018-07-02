package lesson_06_29_pizzeria.drinks;

public class Coffee {
    private boolean sugar;
    private boolean milk;
    private double kaina;

    public Coffee(boolean sugar, boolean milk) {
        this.sugar = sugar;
        this.milk = milk;

        if (sugar && !milk) {
                this.kaina = 1;
            } else if (milk && !sugar) {
                this.kaina = 2;
            } else if (sugar == true && milk == true) {
                this.kaina = 3;
            } else  {
                this.kaina = 0.5;
            }

        }

    }

