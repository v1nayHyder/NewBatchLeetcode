package New_batch_leetcode.striver_cheet_sheet.arrays;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        int start=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]!=0){
                int temp=nums[start];
                nums[start++]=nums[i];
                nums[i]=temp;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
