package udemy_methods;


import java.util.Objects;

import static udemy_methods.Player.calculateHighScorePosition;
import static udemy_methods.Player.displayHighScorePosition;

public class Main {
    public static void main(String[] args) {

        int ranking = calculateHighScorePosition( 50 );
//        displayHighScorePosition( "Petras", ranking );
//
//        printMegaBytesAndKiloBytes( 60000 );
//        printMegaBytesAndKiloBytes( -1500 );
//        System.out.println(isLeapYear( 1950 ));
        System.out.println(areEqualByThreeDecimalPlaces(2, 2));

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {

            int megabytes = kiloBytes / 1024;
            int remainder = kiloBytes - (megabytes * 1024);
            System.out.println( kiloBytes + " = " + megabytes + " MB and " + remainder + " KB" );

        } else {
            System.out.println( "Entered value is invalid" );
        }

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if(hourOfDay >= 0 && hourOfDay <= 23) {
            if((hourOfDay < 8 || hourOfDay > 22) && barking) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999) {
            if (year % 4 != 0) {
                return false;

            } else if (year % 100 != 0) {
                return true;

            } else if (year % 400 != 0) {
                return false;

            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        if(Objects.equals(Math.floor(a * 1000), Math.floor(b * 1000) )) {
            return true;
        }
        return false;
    }
}
