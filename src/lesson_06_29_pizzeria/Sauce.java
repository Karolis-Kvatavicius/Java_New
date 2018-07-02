package lesson_06_29_pizzeria;

public enum Sauce {

    MILD(1),
    MIX(1.1),
    HOT(1.25);

    private double price;

    Sauce(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
