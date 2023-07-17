package test;

import com.google.inject.internal.cglib.core.$LocalVariablesSorter;

import java.util.*;

public class test15 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,2,6,5,12,3,7,21,33,26,9};
        quickSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    public static void quickSort(int[] nums,int left,int right){
        if(left < right){
            int l = left,r = right;
            getPivot(nums,l,r);
            int pivot = left;
            while(l < r){
                while(l < r && nums[r]>=nums[pivot]) r--;
                while(l < r && nums[l]<=nums[pivot]) l++;
                if(l == r) swap(nums,pivot,r);
                else swap(nums,l,r);
            }
            quickSort(nums,left,l-1);
            quickSort(nums,r+1,right);
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void getPivot(int[] nums,int left,int right){
        // 2 5   5-2+1=4  0 1 2 3 + 2
        // 2 3 4 5

        int rand = new Random().nextInt(right-left+1) + left;
        swap(nums,left,rand);
    }
}
