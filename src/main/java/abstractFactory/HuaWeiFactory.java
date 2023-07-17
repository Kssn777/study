package abstractFactory;

public class HuaWeiFactory implements bigFactory {
    public Phone getPhone() {
        return new HuaWeiPhone();
    }

    public Computer getComputer() {
        return new HuaWeiComputer();
    }
}
