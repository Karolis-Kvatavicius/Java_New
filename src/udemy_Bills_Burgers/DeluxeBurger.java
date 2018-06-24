package udemy_Bills_Burgers;

public class DeluxeBurger extends BasicHamburger {

    private boolean chips;
    private boolean drink;
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    public DeluxeBurger() {
        System.out.println("Your check: \nChips: 0.50 $\nDrink: 1.00 $");
        this.price = super.getPrice() + 1.50;
        this.chips = true;
        this.drink = true;
    }
}
