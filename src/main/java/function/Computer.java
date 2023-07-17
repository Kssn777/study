package function;

import java.util.function.Function;
import java.util.function.Supplier;

public class Computer {
    private int common(Function<Integer,Integer> function,int a){
        return function.apply(a);
    }

    public int f1(int a){
        return common((i1->1*i1), a);
    }

    public int f2(int a){
        return common((i1->2*i1), a);
    }

    private String print(Supplier<String> supplier){
        return supplier.get();
    }

    public String f3(){
        return print(()->"f3");
    }

    public String f4(){
        return print(()->"f4");
    }
}
