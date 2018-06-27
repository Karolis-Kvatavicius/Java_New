package lesson12.pizza;
// Sukurti generic klase Box<T1, T2>, kuri butu wrapperis musu picai ir padazui. Ji atitks dezutes savoka musu produktams.
// Box klaseje aprasyti metoda, kuris atspausdintu jos turini (pvz. jei ideta pica Margarita, o padazas svelnus, rezultatas turetu buti: Margarita+svelnus).

public class Box<T1, T2> {

    private T1 pizza;
    private T2 sauce;

    public T1 getPizza() {
        return pizza;
    }

    public T2 getSauce() {
        return sauce;
    }

    public void printBoxContents() {
        System.out.println("Box contains " + getPizza() + " pizza with " + getSauce());
    }

    public void setValue(T1 pizza, T2 sauce) {
        this.pizza = pizza;
        this.sauce = sauce;
    }
}
