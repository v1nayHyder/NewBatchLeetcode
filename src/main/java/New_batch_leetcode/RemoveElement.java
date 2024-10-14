package New_batch_leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length==1&& nums[0]!=val)
            return  1;
        int count=0;
        for (int num:nums) {
            if (num!=val){
                nums[count++]=num;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;




    }
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
