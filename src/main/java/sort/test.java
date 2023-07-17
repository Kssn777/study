package sort;



public class test {

    // 题目要求：写出代码执行之后， 18 行到 22 行的值分别是多少（用注释的方式写在每行尾）
    public static void main(String[] args) {
        int[] nums = new int[]{51,14,76,11,20,13,33,44,67,9,49};
        heapSort(nums);
        for(int num:nums) System.out.print(num+" ");

    }

    private static void heapSort(int[] nums) {
        for(int i = nums.length/2-1;i>=0;i--){
            adjustHeap(nums,i,nums.length);
        }

        for(int i=0;i<nums.length;i++){
            swap(nums,0,nums.length-1-i);
            adjustHeap(nums,0,nums.length-1-i);
        }

    }

    private static void adjustHeap(int[] nums, int parent, int length) {
        int parentVal = nums[parent];
        for(int i=2*parent+1;i<length;i=2*i+1){
            if(i+1<length && nums[i+1]>nums[i]){
                i++;
            }

            if(nums[i] > parentVal){
                nums[parent] = nums[i];
                parent = i;
            }else{
                break;
            }
        }

        nums[parent] = parentVal;

    }

    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
