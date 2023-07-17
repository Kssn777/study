package basic;

import java.util.*;


public class test2 {
    public static void main(String[] args) {
        test2 t = new test2();
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        int k = 4;
        for (Integer integer : t.GetLeastNumbers_Solution(input, k)) {
            System.out.println(integer);
        }
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ans = new ArrayList();
        quickSort(input,0,input.length-1,k);
        for(int i=0;i<k;i++) ans.add(input[i]);
        return ans;
    }

    public void quickSort(int[] input,int left,int right,int k){
        if(left >= right) return;
        int pivot = left;
        int l = left,r = right;
        while(l < r){
            while(l < r && input[r] >= input[pivot]) r--;
            while(l < r && input[l] <= input[pivot]) l++;
            if(l==r) swap(input,l,pivot);
            else swap(input,l,r);
        }
        if(l==k) return;
        else if(l > k - 1) quickSort(input,left,l-1,k);
        else quickSort(input,r+1,right,k);

    }

    public void swap(int[] input,int i,int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
