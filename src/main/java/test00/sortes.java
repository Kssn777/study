package test00;

public class sortes {
    public static void main(String[] args) {
        int[] nums = new int[]{51,67,1,3,77,9,101,31,48,-6,-52,-12,102};
        //quickSort.sort(nums,0,nums.length-1);print(nums);
//        mergeSort.sort(nums,0,nums.length-1);print(nums);
        heapSort.sort(nums);print(nums);
    }

    static class heapSort{
        static void sort(int[] nums){
            for(int i=nums.length/2-1;i>=0;i--){
                adjustHeap(nums,i,nums.length);
            }

            for(int i=0;i<nums.length;i++){
                swap(nums,0,nums.length-1-i);
                adjustHeap(nums,0,nums.length-1-i);
            }
        }

        static void adjustHeap(int[] nums,int parent,int len){
            int parentVal = nums[parent];
            for(int i=2*parent+1;i<len;i=2*i+1){
                if(i+1 < len && nums[i+1] > nums[i]){
                    i = i+1;
                }
                if(nums[i] > parentVal){
                    nums[parent] = nums[i];
                    parent = i;
                }else break;
            }
            nums[parent] = parentVal;
        }
    }

    static class mergeSort{
        static void sort(int[] nums,int l,int r){
            if(l<r){
                int mid = l+(r-l)/2;
                sort(nums,l,mid);
                sort(nums,mid+1,r);
                merge(nums,l,mid,r);
            }
        }
        static void merge(int[] nums,int left,int mid,int right){
            int[] temp = new int[nums.length];
            int index = left;
            int leftStart = left,leftEnd = mid;
            int rightStart = mid+1,rightEnd = right;
            while(leftStart <= leftEnd && rightStart <= rightEnd){
                if(nums[leftStart] <= nums[rightStart]) temp[index++] = nums[leftStart++];
                else temp[index++] = nums[rightStart++];
            }

            while(leftStart <= leftEnd) temp[index++] = nums[leftStart++];
            while(rightStart <= rightEnd) temp[index++] = nums[rightStart++];

            for(int i=left;i<=right;i++) nums[i] = temp[i];
        }

    }


    static class quickSort{

        static void sort(int[] nums,int l,int r){

            if(l < r){
                int left = l,right = r;
                int pivot = left;
                while(left < right){
                    while(left < right && nums[right] >= nums[pivot]) right--;
                    while(left < right && nums[left] <= nums[pivot]) left++;
                    if(left == right){
                        swap(nums,left,pivot);
                    }else{
                        swap(nums,left,right);
                    }
                }
                sort(nums,l,left);
                sort(nums,right+1,r);
            }
        }

    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void print(int[] nums){
        for(int num:nums) System.out.print(num+" ");
        System.out.println();
    }
}
