package academy.devdojo.devdojojava.javacore.ZZFthreads.test;



class ThreadExample extends Thread {

    private char c ;
    public ThreadExample(char c) {
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
        }
    }
}

class ThreadExemplaRunnable implements Runnable {
    private char c ;
    public ThreadExemplaRunnable(char c) {
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
        }
    }
}


//Daemon X User
public class ThreadTest01 {
    static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread( new ThreadExemplaRunnable('A'));
        Thread t2 = new Thread( new ThreadExemplaRunnable('B'));
        Thread t3 = new Thread( new ThreadExemplaRunnable('C'));
        Thread t4 = new Thread( new ThreadExemplaRunnable('D'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
