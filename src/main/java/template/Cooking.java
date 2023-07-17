package template;

public abstract class Cooking {
    private void a(){
        System.out.println("洗菜");
    }

    public abstract void b();

    private void c(){
        System.out.println("上桌");
    }

    public void d(){
        a();
        b();
        c();
    }
}
