package Proxy.StaticProxy;

public class userImpl implements User {
    @Override
    public void login(String name) {
        System.out.println("登录:"+name);
    }

    @Override
    public String print(String msg) {
        return msg;
    }

    private void test(){
        System.out.println("asd");
    }
}
