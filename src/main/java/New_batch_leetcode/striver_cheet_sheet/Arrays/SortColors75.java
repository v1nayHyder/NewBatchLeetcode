package New_batch_leetcode.striver_cheet_sheet.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
       int low=0,mid=0,high=nums.length-1;
       while (mid<=high){
           if(nums[mid]==0){
               int tem=nums[low];
               nums[low]=nums[mid];
               nums[mid]=tem;
               low++;
               mid++;
           } else if (nums[mid]==1) {
               mid++;

           }
           else {
               int tem=nums[mid];
               nums[mid]=nums[high];
               nums[high]=tem;
               high--;
           }

       }

        System.out.println(Arrays.toString(nums));

    }
}
