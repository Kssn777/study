package test00;

import java.util.concurrent.Callable;

/**
 * @author lrh
 * @description
 * @date 2022/8/15
 */
public class callableTest implements Callable<String> {
    @Override
    public String call() throws Exception {
        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
        return "hello,world";
    }
}
