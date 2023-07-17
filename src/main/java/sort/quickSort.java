package sort;

import java.util.Arrays;
import java.util.Random;

public class quickSort {
    public static void main(String[] args) {
        //15,30,11,4,97,46,24,7
        int[] nums = new int[]{4,5,1,6,2,7,3,8};
        int len = nums.length-1;
        quickSort(nums,0,len);
        for (int num : nums) {
            System.out.print(num+" ");

        }
    }
    public static void quickSort(int[] nums,int left,int right){
        if(left < right){
            int l = left,r = right;
            getPivot(nums,left,right);
            int pivot = left;
            while(l < r){
                while(l < r && nums[r] >= nums[pivot]) r--;
                while(l < r && nums[l] <= nums[pivot]) l++;
                if(l == r) swap(nums,pivot,l);
                else swap(nums,l,r);
            }
            quickSort(nums,left,l);
            quickSort(nums,r+1,right);
        }

        
    }
    public static void getPivot(int[] nums,int left,int right)
    {
        //2 3 4 5 -->  0 1 2 3   +   2
        int rand = new Random().nextInt(right - left + 1) + left;
        swap(nums,left,rand);
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void print(int[] nums,int left,int right){
        for(int i=left;i<=right;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("\n");
    }


}
