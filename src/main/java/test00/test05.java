package test00;

import java.util.*;

/**
 * @author lrh
 * @description
 * @date 2022/8/2
 */
public class test05 {
    private String str = new String("hello");
    private char[] ch = {'a','b'};

    public static void main(String[] args) {
       test05 zz = new test05();
       zz.exchange(zz.str,zz.ch);
        System.out.print(zz.str + " and ");
        System.out.print(zz.ch);


    }

    private void exchange(String s, char[] ch) {
        s = "test ok";
        ch[0] = 'c';
    }

    public int add(int a,int b){
        try{
            return a+b;
        }catch (Exception e){
            System.out.println("");
        }finally {
            System.out.println("finally");
        }

        return 0;
    }
}
