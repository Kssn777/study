package test;
import lombok.SneakyThrows;

import java.util.*;

public class test13 {
    volatile static int num = 1;
    static boolean flag = true;
    static test13 t = new test13();
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                while(true){
                    synchronized (t){
                        if(!flag) {
                            try {
                                t.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }else{
                            if(num <= 100){
                                System.out.println(Thread.currentThread().getName() + "--->" + num++);
                                Thread.sleep(500);
                                flag = false;
                                t.notifyAll();
                            }else break;
                        }
                    }
                }

            }
        },"t1");

        Thread t2 = new Thread(new Runnable(){

            @SneakyThrows
            @Override
            public void run() {
                while(true){
                    synchronized (t){
                        if(flag) t.wait();
                        else{
                            if(num <= 100){
                                System.out.println(Thread.currentThread().getName() + "--->" + num++);
                                Thread.sleep(500);
                                flag = true;
                                t.notifyAll();
                            }
                        }
                    }
                }


            }
        },"t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Main");
    }
}
