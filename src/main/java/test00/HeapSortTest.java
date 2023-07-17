package test00;

/**
 * @author lrh
 * @description
 * @date 2023/3/11
 */
public class HeapSortTest {

    public static void main(String[] args) {
        int[] nums = new int[]{1,6,7,3,4,8,11,2};
        heapsort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void heapsort(int[] nums){
        for(int i = nums.length/2 - 1;i>=0;i--){
            adjustHeap(nums,i,nums.length);
        }


        for(int i=0;i<nums.length;i++){
            swap(nums,0,nums.length-1-i);
            adjustHeap(nums,0,nums.length-1-i);
        }

    }

    /**
     * 对第i个节点做自顶向下调整
     * @param nums
     * @param i
     */
    public static void adjustHeap(int[] nums,int i,int len){
        int now = nums[i];
        for(int j=2*i+1;j<len;j=2*j+1){
            if(j+1 < len && nums[j+1] > nums[j]){
                j = j+1;
            }
            if(nums[j] > now){
                swap(nums,i,j);
                i = j;
            }
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
