package test00;
import java.util.*;

/**
 * @author lrh
 * @description
 * @date 2023/3/11
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int num = getMin(str);
        System.out.println(num);
    }

    private static int getMin(String str) {
        char[] words = str.toCharArray();

        int ans = 0;
        for(int r=0,l=0;r<words.length;r++){
            if(words[r] != words[l]){
                ans += (r-l)/2;
                l=r;
            }
            if(r == words.length-1){
                ans += (r-l+1)/2;
            }
        }
        return ans;
    }
}
