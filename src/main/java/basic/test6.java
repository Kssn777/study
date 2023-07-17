package basic;

import java.util.*;

public class test6 {
    public static void main(String[] args) {
        System.out.println(compileSeq("5,0,4,4,5,-1"));
    }

    public static String compileSeq (String input) {
        // write code here
        if(input == null) return null;
        String[] nums = input.split(",");
        int n = nums.length;
        Map<String,List<String>> map = new HashMap();
        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i],new ArrayList<String>());
            map.get(nums[i]).add(String.valueOf(i));
        }

        Queue<String> queue = new PriorityQueue<String>((o1,o2)->(Integer.parseInt(o1)-Integer.parseInt(o2)));

        queue.offer("-1");
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            String key = queue.poll();
            List<String> list = map.get(key);
            if(list!=null){
                for(String next : list){
                    sb.append(next);
                    queue.offer(next);
                    sb.append(",");
                }
            }

        }
        return sb.toString().substring(0,sb.length()-1);
    }
}
