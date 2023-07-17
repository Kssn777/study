package test;

import org.apache.commons.text.translate.UnicodeUnescaper;

import java.lang.reflect.Method;
import java.util.*;

public class testtt {
    private static Object lock = new Object();
    private static int num = 10;
    private static int buf = 0;
    public static void main(String[] args) throws Exception{
        Thread productor = new Thread(() -> {
            synchronized (lock) {
                while (num > 0) {
                    if(buf == 1){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("生产者生产东西啦。。。");
                        num--;
                        buf++;
                        lock.notifyAll();
                    }

                }

            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (lock) {
                while (num > 0) {
                    if(buf == 0){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("消费者消费东西啦。。。");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        buf--;
                        lock.notifyAll();
                    }

                }

            }
        });

        productor.start();
        consumer.start();

        productor.join();
        consumer.join();
    }
}
