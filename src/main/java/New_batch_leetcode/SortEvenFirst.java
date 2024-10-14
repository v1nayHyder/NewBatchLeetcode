package New_batch_leetcode;

import java.util.Arrays;

public class SortEvenFirst {
//    public static int[] sortArrayByParity(int[] nums) {
//
//       int start=0;
//       int end=nums.length-1;
//       while (start<end){
//           if (nums[start]%2!=0 && nums[end]%2==0){
//            int temp=nums[start];
//            nums[start++]=nums[end];
//            nums[end]=temp;
//
//           }
//           if (nums[start]%2==0)
//               start++;
//           if (nums[end]%2!=0)
//               end--;
//
//       }
//       return nums;
//    }
    static int[] sort(int []nums){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int temp=nums[start];
            if (nums[start]>nums[end--]){
                nums[start]=nums[end];
                nums[end--]=temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[]={11,22,3,4,55,6};
//      int newArray[]=  sortArrayByParity(nums);
        int sort[]=sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
