package homework_07_12;

import java.io.*;
import java.util.Arrays;

import static homework_07_12.Regex.*;

public class Main {

    public static void main(String[] args) {

        // Generate array of Integers and get index of Integer provided as first parameter
//        System.out.println(search(5, generate( 100 )) + "\n");

        // Count factorial of parameter long. Does not work well with big numbers.
//        System.out.println( factorial( 5 ) + "\n" );

//        filesCreator();
//        System.out.println();
//
//        // Cut provided URL with regex'es
//        cutUrl(getFIRST());
//        cutUrl(getSECOND());
//        cutUrl(getTHIRD());
//        cutUrl(getFOURTH());
//            readMenu2();

        // Count dashes in provided URL
//        countDashes();


//        System.out.println(packageRice( 2, 1, 12 ));

    }

    static String filesCreator() {

//        Sukuriami ir užpildomi tekstiniai failai. Leidziant programa is naujo, failai perrasomi.
        String foodUrl = "C:\\Users\\karol\\IdeaProjects\\Java\\src\\homework_07_12\\food.txt";
        String drinksUrl = "C:\\Users\\karol\\IdeaProjects\\Java\\src\\homework_07_12\\drinks.txt";
        String menuUrl = "C:\\Users\\karol\\IdeaProjects\\Java\\src\\homework_07_12\\menu.txt";
        FileWriter foodWriter;
        String menuItems = "";


        try {

        foodWriter = new FileWriter( foodUrl );

        foodWriter.write( "Margarita, Salami, Sočioji, Havajų, Kebabas, Hamburgeris" );
        foodWriter.close();

        FileWriter drinksWriter = new FileWriter( drinksUrl );
        drinksWriter.write( "Vanduo, Kava, Coca-Cola, Mineralinis, Arbata, Sultys, Alus, Sprite" );
        drinksWriter.close();

        BufferedReader foodReader = new BufferedReader( new FileReader( foodUrl ) );
        BufferedReader drinksReader = new BufferedReader( new FileReader( drinksUrl ) );

//        menu.txt užpildomas iš food.txt ir drinks.txt failų pirmos eilutės.
        FileWriter menuWriter = new FileWriter( menuUrl );
        menuWriter.write( foodReader.readLine() );
        menuWriter.write( "|" );
        menuWriter.write( drinksReader.readLine() );
        foodReader.close();
        drinksReader.close();
        menuWriter.close();

//        Atspausdinam menu.txt turinį stulpeliu, su skirtuku tarp food.txt ir drinks.txt
        BufferedReader menuReader = new BufferedReader( new FileReader( menuUrl ) );
        menuItems = menuReader.readLine().replaceAll( "\\s", "" )
                .replaceAll( ",", "\n" ).replaceAll( "[|]", "\n======\n" );
        System.out.println( menuItems );
        menuReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return menuItems;
    }

    private static long factorial(long n) {

        long sum = n;

        for (int i = 1; i < n; i++) {

            sum *= (n - i);
        }
        return sum;
    }

    private static Integer[] generate(Integer x) {
        Integer[] list = new Integer[x];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString( list ));
        return list;
    }

    private static Integer search(Integer n, Integer[] list) {

        return Arrays.asList( list ).indexOf( n );
    }

    private static Boolean packageRice(Integer big, Integer small, Integer goal) {

        if(small + (big * 5) == goal) {
            return true;
        } else {
            return false;
        }
    }

    private static void readMenu2() {
        String menu2Url = "C:\\Users\\karol\\IdeaProjects\\Java\\src\\homework_07_12\\menu2.txt";
        try {
            BufferedReader menu2Reader = new BufferedReader( new FileReader( menu2Url ) );
            menu2Reader.lines().forEach( System.out::println );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}