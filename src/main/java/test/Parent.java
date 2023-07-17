package test;

public class Parent  {

    public void get(){
        System.out.println("A");
    }

    public void get(Parent p){
        p.get();
    }

}
