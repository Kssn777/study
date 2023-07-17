package sort;

public class MaxheapSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,1,6,2,7,3,8,984,25,11,448,41,3,7,11};
        int len = nums.length-1;
        heapSort(nums);
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }

    private static void heapSort(int[] nums){
        for(int i=nums.length/2 - 1 ;i>=0;i--){
            adjustHeap(nums,i,nums.length);
        }
        for (int i=0;i<nums.length;i++){
            swap(nums,0,nums.length-1-i);
            adjustHeap(nums,0,nums.length-1-i);
        }
    }

    private static void adjustHeap(int[] nums,int parent,int length) {
        int parentVal = nums[parent];
        for(int i=2*parent+1;i<length;i=2*i+1){
            if(i + 1<length && nums[i]<nums[i+1]){
                i++;//从parent结点寻找左右结点较大值 i为左右结点较大的那个
            }
            if(nums[i] > parentVal){
                nums[parent] = nums[i];//先把parent的节点设置为较大的那个（nums[i]）
                parent = i;//然后parent = i  用作下一轮校验  因为结构有可能会被破坏 所以要从i这个结点再次构建堆

            }else{
                break;
            }

        }
        nums[parent]  = parentVal;
    }

    private static void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
