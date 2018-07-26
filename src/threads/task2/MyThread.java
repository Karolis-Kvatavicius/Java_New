package threads.task2;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println( getName() + " THREAD" );
    }
}
