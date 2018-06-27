package lesson12.day;

import static lesson12.day.Day.FRIDAY;
import static lesson12.day.Day.SUNDAY;


        class DaysMain {
            public static void main(String[] args) {
                // visu enum reiksmiu gavimas
                for (Day d : Day.values()) {
                    System.out.println(d);
                }
                System.out.println();

                System.out.println(Day.MONDAY + "|" + Day.MONDAY.ordinal());

                Day sunday = Day.valueOf("SUNDAY");
                System.out.println(sunday + " " + sunday.getName() + "|" + sunday.getNumber() + "|" + sunday.ordinal());

                // static import ir overridintas metodas
                System.out.println(FRIDAY.getName());

                // enum reiksmiu lyginimas
                System.out.println(sunday.equals(SUNDAY)); // true
                // galima lyginti ir su lygybes zenklu
                System.out.println(sunday == SUNDAY); // true

                System.out.println(Day.TUESDAY == sunday); // false
                System.out.println(null == sunday); // false (null-safe)

                Day day = null;
                System.out.println(day == Day.MONDAY); // false (null-safe)
                System.out.println(Day.THURSDAY.equals(day)); // false (null-safe)
                System.out.println(day.equals(Day.MONDAY)); // NullPointerException, todel reikia import'int MONDAY
            }
        }
