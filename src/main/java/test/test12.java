package test;
import java.util.*;

public class test12 {
    public static void main(String[] args) {
        String s1 = "120.64.4.0/22";
        String s2 = "120.64.8.32";
        System.out.println(solve(s1,s2));


    }

    public static boolean solve(String cidr,String ipAddr){
        String[] sp = cidr.split("/");
        String[] sp1 = sp[0].split("\\.");
        String[] sp2 = ipAddr.split("\\.");

        int count = Integer.parseInt(sp[1]);
        int mask = 0xffffffff << (32 - count);
        int netWork = 0;
        int ip = 0;
        for(int i=0;i<4;i++){
            int a = Integer.parseInt(sp1[i]);
            int b = Integer.parseInt(sp2[i]);

            netWork |= (a << (24 - 8*i));
            ip |= (b << (24 - 8*i));

        }
        return (netWork & mask) == (ip & mask);

    }
}
