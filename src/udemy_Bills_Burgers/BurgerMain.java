package udemy_Bills_Burgers;

import java.util.Scanner;

public class BurgerMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(0 < 1) {
        System.out.println( "Enter a type of burger you want (Basic, Healthy or Deluxe): " );
        String input = scanner.nextLine();

        if (input.equals( "Basic" )) {
            System.out.println( "Do you want tomatoes, pickles, onion, mustard added?. Write true or false for each item accordingly. Typos count as false" );
            new BasicHamburger( Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ) ).printBasicBurger();

        } else if (input.equals( "Deluxe" )) {
            new DeluxeBurger().printBasicBurger();


        } else if (input.equals( "Healthy" )) {
            System.out.println( "Do you want tomatoes, pickles, onion, mustard, salad, feta cheese added?. Write true or false for each item accordingly. Typos count as false" );
            new HealthyBurger( Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ), Boolean.valueOf( scanner.nextLine() ) ).printBasicBurger();

        }
        System.out.println();
    }

//    DeluxeBurger basicHamburger2 = new DeluxeBurger();
//    basicHamburger2.printBasicBurger();
//    System.out.println(basicHamburger2.getBurgerRollType());

//    HealthyBurger healthyBurger1 = new HealthyBurger(true, true, false, true, true, true);
//    healthyBurger1.printBasicBurger();
//    System.out.println();

//    DeluxeBurger deluxeBurger1 = new DeluxeBurger();
//    deluxeBurger1.printBasicBurger();
//    System.out.println();

    }
}
