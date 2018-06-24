package udemy_Bills_Burgers;

public class BurgerMain {
    public static void main(String[] args) {
    BasicHamburger basicHamburger1 = new BasicHamburger(true, true, true, true);
    basicHamburger1.printBasicBurger();
    System.out.println();

    BasicHamburger basicHamburger2 = new BasicHamburger(false, true, true, true);
    basicHamburger2.printBasicBurger();
    System.out.println();

    HealthyBurger healthyBurger1 = new HealthyBurger(true, true, false, true, true, true);
    healthyBurger1.printBasicBurger();
    System.out.println();

    DeluxeBurger deluxeBurger1 = new DeluxeBurger();
    deluxeBurger1.printBasicBurger();
    System.out.println();


    }
}
