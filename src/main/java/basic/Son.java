package basic;

public class Son extends Parent {
    @Override
    public void t1() {
        System.out.println("子类t1");
    }

    public void t2(){
        System.out.println("子类特有方法");
    }

}
