package Async;

import io.netty.util.concurrent.CompleteFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello");
            return "hello";
        }).whenComplete((res,error)-> {
            System.out.println(res + ",world");
            error.printStackTrace();
        });



        /*long start = System.currentTimeMillis();
        System.out.printf("result -> %s\n",cf.get());
        long end = System.currentTimeMillis();
        System.out.printf("time -> %d",end-start);*/

    }
}
