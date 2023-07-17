package basic;

public class sort1 {
    public static void main(String[] args){
        int[] nums = new int[]{14,3,19,54,21,30,44,87,5,1,66};
        quickSort(nums,0,nums.length-1);

        for (int num : nums) {
            System.out.print(num+" ");
        }
    }



    public static void quickSort(int[] nums,int left,int right){
        if(left>=right) return;
        int pivot = left;
        int r = right;
        int l = left;
        while(l<r){
            while(l<r && nums[r] >= nums[pivot]) r--;
            while(l<r && nums[l] <= nums[pivot]) l++;

            if(l==r) swap(nums,l,pivot);
            else swap(nums,l,r);
        }


        quickSort(nums,left,l-1);
        quickSort(nums,l+1,right);
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
