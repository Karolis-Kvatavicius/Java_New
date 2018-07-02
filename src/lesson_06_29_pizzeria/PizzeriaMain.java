package lesson_06_29_pizzeria;

import lesson_06_29_pizzeria.drinks.Beer;
import lesson_06_29_pizzeria.drinks.Coffee;
import lesson_06_29_pizzeria.drinks.Tea;
import lesson_06_29_pizzeria.drinks.Water;
import lesson_06_29_pizzeria.food.PizzaFunghi;
import lesson_06_29_pizzeria.food.PizzaWrap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lesson_06_29_pizzeria.Sauce.MILD;

public class PizzeriaMain {



    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
//        Beer beer = new Beer( "light" );
//        System.out.println(beer.getKaina());

        List<OrderList> orderLists = new ArrayList<>(  );


        String line = null;


        int meniuPasirinkimas = -1;


        do {
            System.out.println( "Pasirinkit uzsakyma : 1. Pasirinkti gerimus,  2. Pasirinkiti maista, 3. Gauti saskaita, 0. Iseiti." );


            meniuPasirinkimas = input.nextInt();

            switch (meniuPasirinkimas) {
                case 0:
                    break;
                case 1:

                    System.out.println( "Pasirinkit gerimus" );

                    do {
                        line = input.nextLine();

                        if (line.equalsIgnoreCase( "Water" )) {
                            Water water = new Water( true );
                        } else if(line.equalsIgnoreCase( "Sparkling water" )) {
                            Water water = new Water( false);
                            int numbers = 0;
                            numbers = input.nextInt();

                            orderLists.add(new OrderList(  water, numbers));

                            System.out.println("test2");
                            System.out.println(orderLists);
                        } else if(line.equalsIgnoreCase( "light beer" )) {
                            Beer beer = new Beer( "light" );
                        }  else if(line.equalsIgnoreCase( "black beer" )) {
                            Beer beer = new Beer( "black" );
                        } else if(line.equalsIgnoreCase( "white beer" )) {
                            Beer beer = new Beer( "white" );

                        } else if(line.equalsIgnoreCase( "coffee sugar" )) {
                            Coffee coffee = new Coffee( true, false );
                        } else if(line.equalsIgnoreCase( "coffee milk" )) {
                            Coffee coffee = new Coffee( false, true);
                        } else if(line.equalsIgnoreCase( "coffee sugar milk" )) {
                            Coffee coffee = new Coffee( true, true );
                        } else if(line.equalsIgnoreCase( "coffee" )) {
                            Coffee coffee = new Coffee( false, false );
                        }

                    else if(line.equalsIgnoreCase( "tea sugar" )) {
                    Tea tea = new Tea( true, false );
                } else if(line.equalsIgnoreCase( "tea honey" )) {
                            Tea tea = new Tea( false, true);
                } else if(line.equalsIgnoreCase( "tea sugar honey" )) {
                            Tea tea = new Tea( true, true );
                } else if(line.equalsIgnoreCase( "tea" )) {
                            Tea tea = new Tea( false, false );
                }



                    } while
                            (!line.equalsIgnoreCase( "end" ));
                    break;
                case 2:
                    System.out.println( "Pasirinkit maista" );

                    do {
                        line = input.nextLine();

                    if(line.equalsIgnoreCase( "funghi svelnus" )) {
                        PizzaWrap pizza = new PizzaWrap(MILD);
                        int numbers = 0;
                        numbers = input.nextInt();

                        orderLists.add(new OrderList(  pizza, numbers));
                        System.out.println(orderLists);
                    }
            } while
                    (!line.equalsIgnoreCase( "end" ));

            }

        }
        while (meniuPasirinkimas != 0);


    }

}
