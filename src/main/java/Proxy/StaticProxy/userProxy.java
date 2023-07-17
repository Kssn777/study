package Proxy.StaticProxy;

public class userProxy implements User{
    private User user;
    public userProxy(User user){
        this.user = user;
    }

    @Override
    public void login(String name) {
        System.out.println("检查");
        user.login(name);
    }
}
