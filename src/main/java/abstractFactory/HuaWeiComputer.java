package abstractFactory;

public class HuaWeiComputer extends Computer {
    protected void getName() {
        System.out.println("华为电脑");
    }

    protected void compute() {
        System.out.println("计算....");
    }
}
