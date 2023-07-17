package test00;

import java.util.*;


/*
3 3 3
BBR
BRB
RBB
0 1 10
2 10 100
10 100 100
**/

public class test1 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String[] sp1 = sc.nextLine().split(" ");
        int N = Integer.parseInt(sp1[0]);
        int K = Integer.parseInt(sp1[1]);
        int[] nums = new int[N];
        for(int i=0;i<N;i++){
            nums[i] = sc.nextInt();
        }
        int maxLen = 0;
        int left = 0,right = 0;
        Map<Integer,Integer> map = new HashMap();
        while(right < N){
            map.putIfAbsent(nums[right],0);
            map.put(nums[right],map.get(nums[right])+1);

            if(map.keySet().size() <= K){
                right++;
                continue;
            }else{
                maxLen = Math.max(maxLen,right-left);
                while(left < right && map.keySet().size() > K){
                    map.put(nums[left],map.get(nums[left])-1);
                    if(map.get(nums[left]) == 0){
                        map.remove(nums[left]);
                    }
                    left++;
                }
            }
        }
        System.out.println(maxLen);

    }



}
