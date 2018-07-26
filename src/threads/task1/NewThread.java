package threads.task1;

class NewThread extends Thread {

    private static int counter;

    @Override
    public void run() {
        increaseCounter();
    }

    static int getCounter() {
        return counter;
    }

    static synchronized int increaseCounter() {
       return counter++;
    }
}