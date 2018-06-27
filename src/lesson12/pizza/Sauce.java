package lesson12.pizza;

//2. Sukurti enum'a Sauce (MILD, SPICY, MIX) su lauku description, kuriame butu detalesne informacija apie padaza (metodas toString() turi isvesti si aprasyma).

enum Sauce {

    MILD("gentle sauce, not hot or spicy."),
    SPICY("various kinds of hot spices sauce."),
    MIX("a mixture of mild and spicy sauces.");

    Sauce(String description) {
       this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    private String description;
}
