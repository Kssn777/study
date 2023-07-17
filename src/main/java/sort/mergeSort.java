package sort;

public class mergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,1,6,2,7,3,8,984,25,11,448,41,3,7,11};
        int len = nums.length-1;
        mergesort(nums,0,len);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    public static void mergesort(int[] nums,int start,int end){
        if(start<end){
            int mid = start + (end-start)/2;
            mergesort(nums,start,mid);
            mergesort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }

    public static void merge(int[] nums,int left,int mid,int right){
        int[] temp = new int[nums.length];
        int leftStart = left,rightStart = mid + 1;
        int index = left;
        while(leftStart <= mid && rightStart<=right){
            if(nums[leftStart] <= nums[rightStart]){
                temp[index++] = nums[leftStart++];
            }else{
                temp[index++] = nums[rightStart++];
            }
        }
        while(leftStart <= mid) {
            temp[index++] = nums[leftStart++];
        }
        while(rightStart <= right) {
            temp[index++]= nums[rightStart++];
        }
        for(int i=left;i<=right;i++){
            nums[i] = temp[i];
        }
    }
}
