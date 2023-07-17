package test00;

import java.util.stream.Collectors;

public class StaticDispatch {
    static abstract class Human{

    }
    static class Man extends Human{

    }
    static class Woman extends Human{

    }

    public void say(Human guy){
        System.out.println("你好");
    }
    public void say(Man guy){
        System.out.println("男人");
    }
    public void say(Woman guy){
        System.out.println("女人");
    }
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sd = new StaticDispatch();
        System.out.println(man instanceof Man);
        sd.say(man);
        sd.say(woman);


    }
}
