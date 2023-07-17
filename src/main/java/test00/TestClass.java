package test00;

public class TestClass {
   
    public static void main(String[] args) throws Exception {
        People p1 = new People();
        Address add = new Address("cn");
        p1.setAge(18);p1.setName("A");p1.setAdd(add);

        People p2 = p1.clone();
        p2.setName("B");

        add.setAdd("us");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
