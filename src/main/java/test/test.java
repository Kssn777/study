package test;

import Clone.Address;
import Clone.Student;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {

    private static Object lock = new Object();
    private static int count = 0;
    public static void main(String[] args) throws Exception{


        Thread A = new Thread(()->{print("A",0,10);},"pA");
        Thread B = new Thread(()->{print("B",1,10);},"pB");
        Thread C = new Thread(()->{print("C",2,10);},"pC");
        A.start();
        B.start();
        C.start();

        A.join();
        B.join();
        C.join();


    }

    private static void print(String content,int state,int times) {
        synchronized (lock){
            for(int i=0;i<times;i++){
                while(count % 3 != state){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "-->"+content);
                count++;
                lock.notifyAll();
            }
        }

    }


}
