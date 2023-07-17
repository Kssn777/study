package test00;
import java.util.*;
public class test02 {

    /**
5 1 2
1 1
2 2
3 3
1 3
1 4
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sp = sc.nextLine().split(" ");
        int N = Integer.parseInt(sp[0]);
        int A = Integer.parseInt(sp[1]);
        int B = Integer.parseInt(sp[2]);
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i=0;i<N;i++){
            String[] t = sc.nextLine().split(" ");
            x[i] = Integer.parseInt(t[0]);
            y[i] = Integer.parseInt(t[1]);
        }

        Map<Integer,List<Integer>> map = new HashMap();
        int max = 0,maxVal = 0;
        for(int i=0;i<N;i++){
            map.putIfAbsent(x[i],new ArrayList<Integer>());
            map.get(x[i]).add(i);

            if(max < map.get(x[i]).size()){
                max = map.get(x[i]).size();
                maxVal = x[i];
            }
        }
        System.out.println(map);
        System.out.println(maxVal);

        List<Integer> list = map.get(maxVal);
        int ans = 0;
        for(int i=0;i<list.size();i++){

        }

    }
}




