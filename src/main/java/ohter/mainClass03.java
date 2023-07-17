package ohter;

import java.util.Scanner;

public class mainClass03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            for(int j=1;j<=k && i-j>=0;j++){
                dp[i] += (dp[i-j]%20211114);
                dp[i] %= 20211114;
            }
        }
        System.out.println(dp[n]);
    }
}
