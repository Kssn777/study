package abstractFactory;

public class MiPhone extends Phone {
    protected void getName() {
        System.out.println("小米手机");
    }

    protected void call() {
        System.out.println("拨打电话");
    }
}
