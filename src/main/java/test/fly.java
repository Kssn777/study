package test;

public interface fly {
    
    void toFly();

    void play();

    public static void test(){
        System.out.println("cc");
    }

    default void t(){
        System.out.println("asd");
    }
}
