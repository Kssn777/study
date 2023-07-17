package abstractFactory;

public class MiFactory implements bigFactory {
    public Phone getPhone() {
        return new MiPhone();
    }

    public Computer getComputer() {
        return new MiComputer();
    }
}
