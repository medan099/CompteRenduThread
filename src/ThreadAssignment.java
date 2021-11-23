public class ThreadAssignment {

    static class Counter {
        synchronized void count() {
            for (int i = 350; i > 0; i--)
                System.out.println(i);
            System.out.println("finish");
        }
    }

    static class MyThread extends Thread {
        private final Counter counter;

        public MyThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            counter.count();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        new MyThread(counter).start();
        MyThread th = new MyThread(counter);
        th.start();

        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
