package Factory.Method;

public class Mainclass {
    public static void main(String[] args) {
        ProductFactory factory = new FactoryA();
        Product product = factory.getProduct();
        System.out.println(product);
    }
}
