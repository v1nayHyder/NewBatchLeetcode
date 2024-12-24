package New_batch_leetcode.striver_cheet_sheet.Arrays;

public class IfArraySortedAndRotated1752 {
    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2,0}));
    }
    public static boolean check(int[] nums) {
        int count=0;
        for (int i = 1; i <nums.length ; i++) {
           if (nums[i-1]>nums[i]){
               count++;
           }
        }
        if(nums[nums.length-1]>nums[0])
            count++;

        return count<=1;
    }
}
