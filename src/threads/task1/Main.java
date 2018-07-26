package threads.task1;

//ND 07.23
//
//        1. Parašyti programą su int skaitliuku. Programa turi sukurti tam tikrą skaičių gijų ir jas paleisti.
//        Kiekviena gija turi padidinti skaitliuką vienetu. Pabaigoje, turi išvesti skaitliuko reikšmę ir palyginti,
//        ar ji sutaps su gijų skaičiumi.
//        Jeigu reikšmė nesutampa, pataisyti programą taip, kad ji sutaptų.

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<NewThread> createdThreads = createThreads( 100000 );

        createdThreads.forEach( Thread::start );

        while (createdThreads.stream().anyMatch( Thread::isAlive )) {

        }

        System.out.println(NewThread.getCounter());

    }


    private static List<NewThread> createThreads(int numberOfThreads) {

        List<NewThread> list = new ArrayList<>(  );

        for (int i = 0; i < numberOfThreads; i++) {
            list.add( new NewThread() ) ;
        }

        return list;
    }
}


