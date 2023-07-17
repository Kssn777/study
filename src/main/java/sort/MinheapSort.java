package sort;

public class MinheapSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,1,6,2,7,3,8,984,25,11,448,41,3,7,11};
        heapSort(nums);
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }

    private static void heapSort(int[] nums) {
        for(int i=nums.length/2-1;i>=0;i--){
            adjustHeap(nums,i,nums.length);
        }
        for(int i=0;i<nums.length;i++){
            swap(nums,0,nums.length-1-i);
            adjustHeap(nums,0,nums.length-1-i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     *
     * @param nums 元素序列
     * @param parent 父节点索引
     * @param length 长度
     */
    private static void adjustHeap(int[] nums, int parent, int length) {
        int parentVal = nums[parent];
        for(int i=parent*2+1;i<length;i=i*2+1){
            if(i+1<length && nums[i]>nums[i+1]){
                i++;
            }
            if(nums[i] < parentVal){
                nums[parent] = nums[i];
                parent = i;
            }else{
                break;
            }
        }
        nums[parent] = parentVal;
    }
}
