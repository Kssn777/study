package Singleton;

public class Singleton01 {
    private static class SingletonHolder{
        private static final Singleton01 obj = new Singleton01();
    }
    private Singleton01(){}
    public static final Singleton01 getInstance(){
        return SingletonHolder.obj;
    }

}
