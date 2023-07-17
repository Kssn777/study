package Singleton;

public class SingletonFactory {
    private static Object lock = new Object();
    private volatile static Object singleton;
    private SingletonFactory(){}

    public static Object getInstance(){
        if(singleton == null){
            synchronized (lock){
                if(singleton == null){
                    singleton = new Object();
                }
            }
        }
        return singleton;
    }

}
