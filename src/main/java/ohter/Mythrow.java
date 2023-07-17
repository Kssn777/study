package ohter;

public class Mythrow extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("我的Exception");
    }
}
