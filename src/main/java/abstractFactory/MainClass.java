package abstractFactory;

public class MainClass {
    public static void main(String[] args) {
        bigFactory factory = new MiFactory();
        factory.getComputer().getName();
        factory.getComputer().compute();
        factory.getPhone().getName();
    }
}
