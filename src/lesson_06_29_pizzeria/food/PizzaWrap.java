package lesson_06_29_pizzeria.food;

import lesson_06_29_pizzeria.Sauce;

import static lesson_06_29_pizzeria.Sauce.HOT;
import static lesson_06_29_pizzeria.Sauce.MILD;
import static lesson_06_29_pizzeria.Sauce.MIX;

public class PizzaWrap {

    private double kaina;

    public PizzaWrap(Sauce sauce) {
        this.kaina = 10;
        if(sauce == MILD) {
            this.kaina = 10 + MILD.getPrice();
        } else if(sauce == MIX) {
            this.kaina = 10 + MIX.getPrice();
        } else if(sauce == HOT) {
            this.kaina = 10 + HOT.getPrice();
        }
    }
}
