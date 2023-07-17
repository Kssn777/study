package Factory.Method;

public class FactoryA implements ProductFactory {
    public Product getProduct() {
        return new Product(1,"a");
    }
}
