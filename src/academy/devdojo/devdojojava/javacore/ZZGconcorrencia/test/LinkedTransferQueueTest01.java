package academy.devdojo.devdojojava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    static void main(String[] args) throws InterruptedException {

        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Sushi"));
        System.out.println(tq.offer("Sushi"));
        System.out.println(tq.offer("Sushi",10, TimeUnit.SECONDS));
        tq.put("sukita");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Sukita");
        }
        System.out.println(tq.tryTransfer("Kali"));
        System.out.println(tq.tryTransfer("Kali", 5 , TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());

    }
}
