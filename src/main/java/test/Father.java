package test;

/**
 * @author lrh
 * @description
 * @date 2023/2/13
 */
public class Father {

    private static final int a = 10;
    static {
        System.out.println("初始化");
    }
    public static int getNum(){
        return a;
    }
    public static int getInner(){
        return FatherInner.b;
    }

    private static class FatherInner{
        private static final int b = 20;
        static {
            System.out.println("内部类初始化");
        }

    }
    public Father(){
        System.out.println("构造器");
    }
}
