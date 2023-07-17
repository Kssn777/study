package test00;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author lrh
 * @description
 * @date 2022/8/10
 */



public class test06 {


    public static void main(String[] args) {
        Date date = new Date(1679411146000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

    }


}
