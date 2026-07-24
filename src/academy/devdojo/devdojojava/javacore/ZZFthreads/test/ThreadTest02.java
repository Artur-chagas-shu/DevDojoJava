package academy.devdojo.devdojojava.javacore.ZZFthreads.test;


class ThreadExemplaRunnable2 implements Runnable {
    private String c;

    public ThreadExemplaRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}


public class ThreadTest02 {
    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExemplaRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExemplaRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.join();
        t2.start();


    }

}
