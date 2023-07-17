package basic;

import java.util.*;

/*
15
0 7 7 7
*5#++B+B+++++$3
55#+++++++###$$
###$++++++#+*#+
++$@$+++$$$3+#+
+++$$+++$+4###+
A++++###$@+$++A
+++++#++$#$$+++
A++++#+5+#+++++
+++$$#$++#++++A
+++$+@$###+++++
+###4+$+++$$+++
+#+3$$$+++$##++
+#*+#++++++#$$+
$####+++++++$##
3$+++B++B++++#5
 */
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,y,ex,ey;
        y = sc.nextInt();
        x = sc.nextInt();
        ey = sc.nextInt();
        ex = sc.nextInt();
        sc.nextLine();
        char[][] grid = new char[n][n];
        for(int i=0;i<n;i++){
            grid[i] = sc.nextLine().toCharArray();
        }
        int[][] map = new int[n][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] a = queue.poll();
            int ix = a[0],iy = a[1];
            int step = map[ix][iy];
            if(ix == ex && iy == ey) break;
            step++;
            //向上走
            if(ix-1>=0 && grid[ix-1][iy] != '#' && grid[ix-1][iy] != '@' && map[ix-1][iy] == 0){
                queue.offer(new int[]{ix-1,iy});
                map[ix-1][iy] = step;
            }
            //向下走
            if(ix+1<n && grid[ix+1][iy] != '#' && grid[ix+1][iy] != '@' && map[ix+1][iy] == 0){
                queue.offer(new int[]{ix+1,iy});
                map[ix+1][iy] = step;
            }
            //向右走
            if(iy+1<n && grid[ix][iy+1] != '#' && grid[ix][iy+1] != '@' && map[ix][iy+1] == 0){
                queue.offer(new int[]{ix,iy+1});
                map[ix][iy+1] = step;
            }
            //向左走
            if(iy-1>=0 && grid[ix][iy-1] != '#' && grid[ix][iy-1] != '@' && map[ix][iy-1] == 0){
                queue.offer(new int[]{ix,iy-1});
                map[ix][iy-1] = step;
            }
        }
        System.out.println(map[ex][ey]);

    }


}
