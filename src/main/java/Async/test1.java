package Async;

import net.minidev.json.JSONUtil;

import java.util.concurrent.*;

public class test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        Future<String> future = pool.submit(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(false) throw new RuntimeException();
            return "asd";
        });
        long start = System.currentTimeMillis();
        System.out.printf("result -> %s\n",future.get());
        long end = System.currentTimeMillis();
        System.out.printf("time -> %d",end-start);
        pool.shutdown();
    }
}
