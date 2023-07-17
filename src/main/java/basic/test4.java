package basic;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {

    }

    public String largestNumber(int[] nums) {
        quickSort(nums);
        return null;
    }
    public void quickSort(int[] nums){
        quickSort(nums,0,nums.length-1);
    }
    public void quickSort(int[] nums,int left,int right){
        int pivot = left;
        int l = left,r = right;
        while(l < r){
            while(l < r && (String.valueOf(nums[r])+String.valueOf(nums[pivot])).compareTo(String.valueOf(nums[pivot])+String.valueOf(nums[r])) >= 0) r--;
            while(l < r && (String.valueOf(nums[l])+String.valueOf(nums[pivot])).compareTo(String.valueOf(nums[pivot])+String.valueOf(nums[l])) <= 0) l++;
            if(l == r){
                int temp = nums[pivot];
                nums[pivot] = nums[l];
                nums[l] = temp;
            }else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        quickSort(nums,left,l-1);
        quickSort(nums,l+1,right);
    }







}
