package test;
import org.omg.CORBA.Object;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;
public class test11 {


    public static void main(String[] args){
        int[] nums = new int[]{15,30,11,4,97,46,24,7};
        mySort(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }
    }

    private static void mySort(int[] nums) {
        heapSort(nums);
    }

    private static void heapSort(int[] nums) {
        int n = nums.length;
        for(int i=n/2-1;i>=0;i--){
            adjustHeap(nums,i,n);
        }

        for(int i=0;i<n;i++){
            swap(nums,0,n-1-i);
            adjustHeap(nums,0,n-i-1);
        }

    }

    private static void adjustHeap(int[] nums, int i, int len) {

        for(int j=2*i+1;j<len;j=2*j+1){
            if(j+1 < len && nums[j+1] > nums[j]){
                j = j + 1;
            }
            if(nums[i] < nums[j]){
                swap(nums,i,j);
                i = j;
            }else{
                break;
            }
        }

    }


    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
