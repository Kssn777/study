package test00;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Threadtest {
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(()->{
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("t1....");
       });

        Thread t2 = new Thread(()->{
            try {
                t1.join();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2....");
        });

        t1.join();
        t2.join();
        t1.start();
        t2.start();
        System.out.println("Main");
    }
}
