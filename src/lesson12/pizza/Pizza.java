package lesson12.pizza;
//Sukurti klase Pizza, su lauku name (metodas toString() turi isvesti si pavadinima).

public class Pizza {

    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
