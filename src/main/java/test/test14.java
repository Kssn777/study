package test;

public class test14 {
    static int num = 1;


    static byte[] lock = new byte[0];
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(()->{
            synchronized (lock){
                while(num <= 100){
                    if((num%3) != 1){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println(Thread.currentThread().getName() +"---->"+num++);
                        lock.notifyAll();
                    }
                }
            }

        },"t1");

        Thread t2 = new Thread(()->{
            synchronized (lock){
                while(num <= 100){
                    if((num%3) != 2){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println(Thread.currentThread().getName() +"---->"+num++);
                        lock.notifyAll();
                    }
                }
            }


        },"t2");

        Thread t3 = new Thread(()->{
            synchronized (lock){
                while(num <= 100){
                    if((num%3) != 0){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println(Thread.currentThread().getName() +"---->"+num++);
                        lock.notifyAll();
                    }
                }
            }


        },"t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
