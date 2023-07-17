package test00;
import java.util.*;
public class test04 {



    public static void main(String[] args) {
        System.out.println(new test04().LCS("abc","def"));
    }
    public String LCS (String s1, String s2) {
        // write code here
        int m = s1.length(),n = s2.length();
        String[][] dp = new String[m+1][n+1];
        for(int i=0;i<=m;i++) Arrays.fill(dp[i],"");


        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+(s1.charAt(i-1));
                }else{
                    if(dp[i-1][j].length() > dp[i][j-1].length()){
                        dp[i][j] = new String(dp[i-1][j]);
                    }else{
                        dp[i][j] = new String(dp[i][j-1]);
                    }
                }
            }
        }

        return dp[m][n].length() == 0?"-1":dp[m][n];
    }
}
