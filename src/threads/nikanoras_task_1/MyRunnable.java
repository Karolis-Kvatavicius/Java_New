package threads.nikanoras_task_1;

    public class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                SynchronizedCounter.incrementValue();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        static int getRunningThreads() {
            System.out.println("Total running threads: " + SynchronizedCounter.getCount());
            return SynchronizedCounter.getCount();
        }

    }


    class SynchronizedCounter {
        private static int count = 0;

        public synchronized static void incrementValue() {
            count ++;
        }

        public static int getCount() {
            return count;
        }
    }
