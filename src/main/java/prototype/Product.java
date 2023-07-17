package prototype;

import java.util.Date;

public class Product implements Cloneable{

    private String name = "fff";
    private Date date = new Date();

    public Product(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Product obj = (Product) super.clone();
        //obj.date = (Date) this.date.clone();//深克隆
        return obj;
    }
}
