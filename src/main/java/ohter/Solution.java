package ohter;

import java.util.HashSet;

public class Solution {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        HashSet<Integer> set = new HashSet();
        int n = nums.length;
        int[] ans =  new int[n];

        int i=0;
        while(set.size()<n){
            long time = System.currentTimeMillis();
            int index = (int)time % n;
            if(set.add(nums[index])) ans[i++] = nums[index];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution(new int[]{1,2,3});
        System.out.println(s.shuffle());
        System.out.println(s.shuffle());

    }
}
