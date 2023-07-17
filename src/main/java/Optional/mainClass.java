package Optional;

import java.util.Optional;

public class mainClass {

    public static void main(String[] args) {
        Optional<Integer> a = Optional.ofNullable(new Integer(10));
        Optional<Integer> b = Optional.ofNullable(null);
        System.out.println(new mainClass().sum(a,b));
    }

    public int sum(Optional<Integer> a,Optional<Integer> b){
        Integer v1 = a.orElse(new Integer(0));
        Integer v2 = b.orElse(new Integer(0));

        System.out.println("a的值是否存在：" + a.isPresent());
        System.out.println("b的值是否存在：" + b.isPresent());

        return v1 + v2;
    }

}
