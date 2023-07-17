package Async;

public class Calculator {
    public void calculate(int a,int b,Student student){
        int res = a + b;
        student.fillBlank(a,b,res);
    }
}
