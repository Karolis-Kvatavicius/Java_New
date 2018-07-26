package threads.task2;

//2. Parašyti programą, kuri priima du komandinės eilutės parametrus. Pirmas nurodo gijų skaičių, antras sukūrimo tipą.
//Galimi tipai: thread, runnable, lambda. Gijos turi būti kuriamos priklausomai nuo tipo, o vykdymo metu spausdinti savo vardą bei tipą.
//Jei pasirinkta thread - naudojama klasė paveldėjusi Thread, jei runnable - klasė implementavusi Runnable, jei lambda - anoniminė klasė naudojant lamda notation.
//Programa turi validuoti argumentus (jei jie netinkami, turi išmesti klaidą ir užbaigti darbą) bei priimti juos kaip case-insensitive.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        if (args[0].matches( "[1-9][0-9]*" )) {

            List<Thread> threadList = new ArrayList<>();
            Runnable task;

            for (int i = 0; i < Integer.parseInt( args[0] ); i++) {

                if (args[1].equalsIgnoreCase( "thread" )) {
                    threadList.add( new MyThread() );
                    threadList.get( i ).start();

                } else if (args[1].equalsIgnoreCase( "runnable" )) {
                    threadList.add( new Thread( new MyRunnable() ) );
                    threadList.get( i ).start();

                } else if (args[1].equalsIgnoreCase( "lambda" )) {
                    task = () -> System.out.println(Thread.currentThread().getName() + " LAMBDA");
                    threadList.add( new Thread( task ));
                    threadList.get( i ).start();
                }

                else {
                    System.out.println("Wrong arguments");
                    break;
                }

            }
        } else {
            System.out.println("Wrong arguments");
        }
    }
}
