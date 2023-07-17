package basic;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] matrix = new char[m][n];
        for(int i=0;i<m;i++){
            matrix[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] != '0'){
                    ans++;
                    dfs(matrix,i,j,'1');
                    dfs(matrix,i,j,'2');
                    dfs(matrix,i,j,'3');
                }
            }
        }
        System.out.print(ans);

    }
    public static void dfs(char[][] matrix,int i,int j,char target){
        if(i<0 || j<0 || i==matrix.length || j==matrix[0].length || matrix[i][j] != target){
            return ;
        }
        matrix[i][j] = '0';
        dfs(matrix,i-1,j,target);
        dfs(matrix,i+1,j,target);
        dfs(matrix,i,j-1,target);
        dfs(matrix,i,j+1,target);
    }
}
