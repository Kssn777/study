package abstractFactory;

public class MiComputer extends Computer {
    protected void getName() {
        System.out.println("小米电脑");
    }

    protected void compute() {
        System.out.println("计算....");
    }
}
