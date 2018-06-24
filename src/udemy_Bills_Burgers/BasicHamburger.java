package udemy_Bills_Burgers;

public class BasicHamburger {
    private String burgerRollType;
    private String meat;
    private double price;
    private boolean tomatoes;
    private boolean pickles;
    private boolean onion;
    private boolean mustard;

    public double getPrice() {
        return price;
    }

    public void printBasicBurger() {
        System.out.println("Base price: " + new BasicHamburger().getPrice() + " $");
        System.out.println("Burger price: " + Math.round(getPrice() * 100.0) / 100.0 + " $");
    }

    public BasicHamburger() {
        this.price = 2.29;
        this.burgerRollType = "white bread bun";
        this.meat = "beef";
    }


    public BasicHamburger(boolean tomatoes, boolean pickles, boolean onion, boolean mustard) {
        this.tomatoes =tomatoes;
        this.pickles = pickles;
        this.onion = onion;
        this.mustard = mustard;
        this.burgerRollType = "white bread bun";
        this.meat = "beef";
        System.out.println("Your check: ");
        // 1
        if(!tomatoes && !pickles && !onion && !mustard) {
            this.price = 2.29; // base burger
        } else if(tomatoes && !pickles && !onion && !mustard) {
            this.price = 2.54; // 0.25
            System.out.println("Tomatoes: 0.25 $");
        } else if(pickles && !tomatoes && !onion && !mustard) {
            this.price = 2.60; // 0.31
            System.out.println("Pickles: 0.31 $");
        } else if(onion && !tomatoes && !pickles && !mustard) {
            this.price = 2.50; // 0.21
            System.out.println("Onion: 0.21 $");
        } else if(mustard && !tomatoes && !pickles && !onion) {
            this.price = 2.49; // 0.20
            System.out.println("Mustard: 0.20 $");

            // 2
        } else if(tomatoes && pickles && !onion && !mustard) {
            this.price = 2.85;
            System.out.println("Tomatoes: 0.25 $\nPickles: 0.31 $");
        } else if(tomatoes && onion && !pickles && !mustard) {
            this.price = 2.75;
            System.out.println("Tomatoes: 0.25 $\nOnion: 0.21 $");
        } else if(tomatoes && mustard && !onion && !pickles) {
            this.price = 2.74;
            System.out.println("Tomatoes: 0.25 $\nMustard: 0.20 $");
        } else if(pickles && onion && !tomatoes && !mustard) {
            this.price = 2.81;
            System.out.println("Pickles: 0.31 $\nOnion: 0.21 $");
        } else if(pickles && mustard && !tomatoes && !onion) {
            System.out.println("Pickles: 0.31 $\nMustard: 0.20 $");
            this.price = 2.80;
        } else if(onion && mustard && !tomatoes && !pickles) {
            System.out.println("Onion: 0.21 $\nMustard: 0.20 $");
            this.price = 2.70;

            // 3
        } else if(tomatoes && pickles && onion && !mustard) {
            System.out.println("Tomatoes: 0.25 $\nPickles: 0.31 $\nOnion: 0.21 $");
            this.price = 3.06;
        } else if(tomatoes && pickles && mustard && !onion) {
            System.out.println("Tomatoes: 0.25 $\nPickles: 0.31 $\nMustard: 0.20 $");
            this.price = 3.05;
        } else if(pickles && onion && mustard && !tomatoes) {
            System.out.println("Pickles: 0.31 $\nOnion: 0.21 $\nMustard: 0.20 $");
            this.price = 3.01;
        } else if(tomatoes && onion && mustard && !pickles) {
            System.out.println("Tomatoes: 0.25 $\nOnion: 0.21 $\nMustard: 0.20 $");
            this.price = 2.95;

            //4
        } else if(tomatoes && pickles && onion && mustard) {
            System.out.println("Tomatoes: 0.25 $\nPickles: 0.31 $\nOnion: 0.21\nMustard: 0.20 $");
            this.price = 3.26;
        }


    }
}
