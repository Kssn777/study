package Build;

import java.util.Date;

public class Product {
    private String name;
    private Date date;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    private Product(Builder builder){
        this.name = builder.getName();
        this.date = builder.getDate();
    }

    static class Builder{
        private String name;
        private Date date;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;

        }

        public Date getDate() {
            return date;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Product build(){
            return new Product(this);
        }

    }

}
