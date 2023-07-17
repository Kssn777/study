package test;


import java.util.*;

//[[7,34,45,10,12,27,13],[27,21,45,10,12,13]]
public class test7 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{7,34,45,10,12,27,13},{27,21,45,10,12,13}};
        test7 zz = new test7();
        List<Integer> list = zz.intersection(nums);
        list.sort((i1,i2)->i1-i2);
        System.out.println(list);
    }

    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        if(n==1) return getList(nums[0]);
        int[] temp = intersect(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            temp = intersect(temp,nums[i]);
        }

        return getList(temp);
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public List<Integer> getList(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        return list;
    }
}
