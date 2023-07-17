package Clone;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("BJ");
        String name = "abc";
        Student s1 = new Student(1,name,address);
        Student s2 = (Student) s1.clone();
        address.setName("SH");
        System.out.println(s1);
        System.out.println(s2);
    }
}
