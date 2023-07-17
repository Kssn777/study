package stream;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println("最长的字符串：" + max.get());


        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        Optional<Person> maxSalary = personList.stream().max(Comparator.comparing(Person::getSalary));
        System.out.println("员工工资最大值：" + maxSalary.get().getSalary());

        List<Integer> listInt = Arrays.asList(7, 6, 4, 8, 2, 11, 9);

        long count = listInt.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }

}
