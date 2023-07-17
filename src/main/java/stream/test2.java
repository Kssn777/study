package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
        list.stream().filter(x -> x>6).forEach(System.out::println);
        //匹配第一个大于6的值
        Optional<Integer> first = list.stream().filter(x -> x > 6).findFirst();
        //匹配任意一个值
        Optional<Integer> any = list.stream().filter(x -> x > 6).findAny();
        //是否有特定条件的值
        boolean b = list.stream().anyMatch(x -> x > 10);
        System.out.println("第一个大于6的值" + first.orElse(-1));
        System.out.println("任意一个大于6的值" + any.orElse(-1));
        System.out.println("是否存在大于6的值" + b);
    }
}
