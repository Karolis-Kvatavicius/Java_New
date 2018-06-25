package udemy_Bills_Burgers;

public class HealthyBurger extends BasicHamburger {

    private boolean salad;
    private boolean fetaCheese;
    private double price;
    private String burgerRollType;


    @Override
    public double getPrice() {
        return price;
    }

    public HealthyBurger() {
        super( false, false, false, false );
        this.burgerRollType = "brown rye bread roll";
        this.salad = false;
        this.fetaCheese = false;
    }

    public HealthyBurger(boolean tomatoes, boolean pickles, boolean onion, boolean mustard, boolean salad, boolean fetaCheese) {
        super( tomatoes, pickles, onion, mustard);
        this.burgerRollType = "brown rye bread roll";
        this.salad = salad;
        this.fetaCheese = fetaCheese;

        if(!salad && !fetaCheese) {
            this.price = super.getPrice();
        } else if(salad && !fetaCheese) {
            System.out.println("Salad: 0.15 $");
            this.price = super.getPrice() + 0.15;
        } else if(!salad && fetaCheese) {
            System.out.println("Feta Cheese: 0.25 $");
            this.price = super.getPrice() + 0.25;
        } else if(salad && fetaCheese) {
            System.out.println("Salad: 0.15 $\nFeta Cheese: 0.25 $");
            this.price = super.getPrice() + 0.40;
        }
    }
}
