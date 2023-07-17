package Factory.Method;

public class FactoryB implements ProductFactory {
    public Product getProduct() {
        return new Product(2,"B");
    }
}
