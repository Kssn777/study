package Clone;

public class Student implements Cloneable{
    private int id;
    private String name;
    private Address address;
    public Student(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student =(Student)super.clone();
        student.address = (Address) this.address.clone();
        return student;
    }
}
