package threads.nikanoras_task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        createThreads(100000);
    }

    static int createThreads(int threadNumber) {
        List<Thread> myRunnableThreadList = new ArrayList<>();
        for (int i = 0; i < threadNumber; i++) {
            myRunnableThreadList.add(new Thread(new MyRunnable()));
        }
        for (int i = 0; i < myRunnableThreadList.size(); i++) {
            myRunnableThreadList.get(i).start();
        }
        while (true) {
            if (myRunnableThreadList.stream().noneMatch(Thread::isAlive)) {
                break;
            }
        }
        return MyRunnable.getRunningThreads();
    }
}
