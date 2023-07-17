package basic;

import test.ComparatorImpl;
import test.fly;

import java.lang.reflect.Field;
import java.util.*;

public class test1 {
    /*
                interface : List    //数组为基础

             ArrayList  动态数组

             LinkedList  链表
                Vector  线程安全的  动态数组 效率低  原因synchronize
                   Queue  LinkedList   队列    PriorityQueue  优先队列  堆
                   Deque   LinkedList  双端队列、栈


                   interface: Set
                 HashSet    LinkedHashSet  TreeSet

                 interface: Map
              HashMap  TreeMap  LinkedHashMap

     */
    public static void main(String[] args) {
       String s = "asd  ff g";
        String[] s1 = s.split("  ");
        for (String s2 : s1) {
            System.out.println(s2);
        }

    }


}
