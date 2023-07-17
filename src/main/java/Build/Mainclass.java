package Build;

import java.util.Date;

public class Mainclass {
    public static void main(String[] args) {
        Product.Builder builder = new Product.Builder();
        Product product = builder.setDate(new Date()).setName("芜湖").build();
        System.out.println(product);
    }
}
