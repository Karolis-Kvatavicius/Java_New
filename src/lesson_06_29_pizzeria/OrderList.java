package lesson_06_29_pizzeria;

import lesson_06_29_pizzeria.drinks.Beer;
import lesson_06_29_pizzeria.drinks.Coffee;
import lesson_06_29_pizzeria.drinks.Tea;
import lesson_06_29_pizzeria.drinks.Water;
import lesson_06_29_pizzeria.food.PizzaWrap;

public class OrderList {
    Coffee coffee;
    Tea tea;
    Water water;
    Beer beer;
    PizzaWrap wrap;
    int kiekis;

    public OrderList(Coffee coffee, int kiekis) {
        this.coffee = coffee;
        this.kiekis = kiekis;
    }

    public OrderList(Tea tea, int kiekis) {
        this.tea = tea;
        this.kiekis = kiekis;
    }

    public OrderList(Water water, int kiekis) {
        this.water = water;
        this.kiekis = kiekis;
    }

    public OrderList(Beer beer, int kiekis) {
        this.beer = beer;
        this.kiekis = kiekis;
    }

    public OrderList(PizzaWrap wrap, int kiekis) {
        this.wrap = wrap;
        this.kiekis = kiekis;
    }



    @Override
    public String toString() {
        return "OrderList{" +
wrap +
                ", water=" + water +

                ", kiekis=" + kiekis +
                '}';
    }
}
