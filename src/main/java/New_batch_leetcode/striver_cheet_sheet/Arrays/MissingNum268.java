package New_batch_leetcode.striver_cheet_sheet.Arrays;

import java.util.Arrays;

public class MissingNum268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
    }
    public  static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = ((n + 1) * n) / 2;
        int sum = Arrays.stream(nums).sum();
        return totalSum - sum;
//        int n=nums.length;
//     int totalSum=((n+1)*n)/2;
//     int sum=0;
//     for(int num:nums){
//         sum+=num;
//     }
//     return totalSum-sum;
    }
}
