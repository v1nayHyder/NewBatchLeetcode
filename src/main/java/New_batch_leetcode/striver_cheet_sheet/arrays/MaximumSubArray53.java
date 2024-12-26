package New_batch_leetcode.striver_cheet_sheet.arrays;

public class MaximumSubArray53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    private static int  maxSubArray(int[] nums) {
          int maxSum=nums[0];
          int  n=nums.length;
          int sum=0;
          int start=0;
          while (start<n){
                sum+=nums[start];
                maxSum=Math.max(maxSum,sum);
                if (sum<0){
                    sum=0;
                }
                start++;

          }

          return maxSum;


//        int maxSum=Integer.MIN_VALUE;
//        for (int i = 0; i <nums.length ; i++) {
//            int sum=0;
//            for (int j = i; j <nums.length ; j++) {
//                sum+=nums[j];
//                maxSum=Math.max(maxSum,sum);
//            }
//        }
//        System.out.println(maxSum);
//        return maxSum;
    }
}
