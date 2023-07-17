package prototype;

import Clone.Student;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Product product = new Product("aaa",date);
        Product clone = (Product) product.clone();

        clone.setDate(new Date(1561561116));

        System.out.println(product);
        System.out.println(clone);
        
    }
}
