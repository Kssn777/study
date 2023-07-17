package basic;


public class sortTest {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,1,6,2,7,3,8,984,25,11,448,41,3,7,11};
        heapSort(nums);
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }

    private static void heapSort(int[] nums) {
        for(int i=nums.length/2-1;i>=0;i--){
            //建立大根堆  才能升序排序
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

    private static void adjustHeap(int[] nums, int i, int length) {
        int temp = nums[i];//当前需要调整的元素

        //从左孩子开始
        for(int k = 2*i+1;k<length;k=k*2+1){
            //因为是建立大根堆，所以找最大的出来
            if(k+1 < length && nums[k] < nums[k+1]) k=k+1;

            if(nums[k] > temp){
                /*如果发现可以交换，那就先把左/右孩子的值先放在此时的i，然后i等于k，k就是比较大的那个孩子的索引，
                然后从该索引开始，继续从它的左孩子开始调整堆，这样一来，到最后i一定是最终temp落地的索引*/
                nums[i] = nums[k];
                i = k;
            }
        }
        nums[i] = temp;

    }
    
}
