package New_batch_leetcode;

public class MinEleRoatedArray {
    public static int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if(nums[start]<=nums[end]){
                min=Math.min(min,nums[start]);
                break;
            }
            if (nums[start]<=nums[mid]){
                min=Math.min(min,nums[start]);
                start=mid+1;
            }
            else {
                end=mid-1;
                min=Math.min(min,nums[mid]);
            }
        }
    return min;
    }

        public static void main(String[] args) {
        int nums[]={3,4,5,1,2};
            System.out.println(findMin(nums));

    }
}
