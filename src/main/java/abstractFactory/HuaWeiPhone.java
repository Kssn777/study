package abstractFactory;

public class HuaWeiPhone extends Phone {
    protected void getName() {
        System.out.println("华为手机");
    }

    protected void call() {
        System.out.println("拨打电话");

    }
}
