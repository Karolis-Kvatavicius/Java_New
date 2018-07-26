package threads.task2;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() + " RUNNABLE" );
    }
}
