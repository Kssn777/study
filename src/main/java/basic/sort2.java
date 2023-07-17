package basic;

public class sort2 {
    public static void main(String[] args) {
        int[] nums = new int[]{14,3,19,54,21,30,44,87,5,1,66};
        mergeSort(nums,0,nums.length-1);

        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    public static void mergeSort(int[] nums,int left,int right){
        if(left<right){
            int mid = left + (right - left)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }

    public static void merge(int[] nums,int left,int mid,int right){
        int[] temp = new int[nums.length];
        int leftStart = left,leftEnd = mid;
        int rightStart = mid+1,rightEnd = right;
        int index = left;
        while(leftStart <= leftEnd && rightStart <= rightEnd){
            if(nums[leftStart] <= nums[rightStart]){
                temp[index++] = nums[leftStart++];
            }else{
                temp[index++] = nums[rightStart++];
            }
        }
        while(leftStart <= leftEnd) temp[index++] = nums[leftStart++];
        while(rightStart <= rightEnd) temp[index++] = nums[rightStart++];
        for(int i=left;i<=right;i++){
            nums[i] = temp[i];
        }
    }
}
