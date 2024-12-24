package New_batch_leetcode.striver_cheet_sheet.Arrays;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
     rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    public static void rotate(int[] nums, int k) {

        int n=nums.length-1;
        k=k%nums.length;
        while (k>0){
            int temp=nums[n];
            for (int i = n; i >0 ; i--) {
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
