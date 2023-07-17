package ohter;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    private ReentrantLock lock = new ReentrantLock();
    private Condition jishu = lock.newCondition();
    private Condition oushu = lock.newCondition();
    private volatile boolean flag = true;//能否打印奇数
    public void test () {
        Thread t1 = new Thread(()->{
            lock.lock();
            try {
                for(int i=1;i<=99;i+=2){
                    if(!flag){
                        oushu.signal();
                        jishu.await();
                    }
                    System.out.println(i);
                    flag = false;
                }
                if(!flag){
                    oushu.signal();
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });

        Thread t2 = new Thread(()->{
            lock.lock();
            try {
                for(int i=2;i<=100;i+=2){
                    if(flag){
                        jishu.signal();
                        oushu.await();
                    }
                    System.out.println(i);
                    flag = true;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });

        t1.start();
        t2.start();




    }

    public static void main(String[] args) {
        test t = new test();
        t.test();
    }

}
