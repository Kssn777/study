package Async;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;

    public void help(int a,int b){
        new Calculator().calculate(a,b,this);
    }

    public void fillBlank(int a,int b,int res){
        System.out.println("填空res = " + res);
    }
}
