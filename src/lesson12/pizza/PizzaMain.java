package lesson12.pizza;
//        Naujoje klaseje (pvz. PizzaMain) sukurti dezute, ideti i ja pica su padazu ir patikrinti dezutes turini.

public class PizzaMain {
    public static void main(String[] args) {

        Pizza salami = new Pizza("Pepperoni");
        Sauce salamiSauce = Sauce.valueOf("MILD");

        Box<Pizza, Sauce> box1 = new Box<>();
        box1.setValue(salami, salamiSauce);
        box1.printBoxContents();
    }

}
