package ohter;

import java.util.Scanner;

public class mainClass02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int a = 2,b=3;
        if(n<=6) System.out.println("No");
        for(;b<=n;b++){
            if(isTrue(a) && isTrue(b)){
                if(isTrue(a+b+1) && a+b+1<=n) {
                    count++;
                }
                a=b;
            }

        }
        if(count == k) System.out.println("Yes");
        else System.out.println("No");


    }
    public static boolean isTrue(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        }

}
