package test;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class test5 {
    private static long[] p,h;
    //Use combinatorics to find the number of ways to order the steps.
    public static void main(String[] args) {
        String s = "banana";
        String s1 = longestDupSubstring(s);
        System.out.println(s1);

    }

    public static String longestDupSubstring(String s) {
        int P = 1313131;
        int n = s.length();
        p = new long[n];
        h = new long[n];
        p[0] = 1;
        h[0] = s.charAt(0);
        for(int i=1;i<n;i++){
            p[i] = p[i-1] * P;
            h[i] = h[i-1] + p[i] * s.charAt(i);
        }
        int left = 0,right = n;
        String ans = "";
        while(left < right){
            int mid = (left + right + 1) >> 1;
            String check = check(s,mid);
            int checkLen = check.length();
            if(checkLen == 0){
                right = mid - 1;
            }else{
                left = mid;
            }
            ans = checkLen > ans.length()?check:ans;
        }
        return ans;

    }

    public static String check(String s,int len){
        Map<Long,Integer> map = new HashMap();
        for(int i=0;i+len<=s.length();i++){
            int j = i+len;
            System.out.println(len);
            long hash = h[j-1] - h[i+1];
            int cnt = map.getOrDefault(hash,0);
            if(cnt == 1) return s.substring(i,j);
            map.put(hash,cnt+1);
        }
        return "";
    }
}
