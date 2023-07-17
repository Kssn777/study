package test00;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Son {
    private String name;
    public Son(){}
    public Son(String name){
        this.name = name;
    }
    public void train(CallBack mother){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mother.call();


    }
}
