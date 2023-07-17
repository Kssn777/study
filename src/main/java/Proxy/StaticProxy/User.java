package Proxy.StaticProxy;

public interface User {
    void login(String name);
    default String print(String msg){
        return null;
    }
}
