package New_batch_leetcode.daily_challenge;

public class NumWaysSplitArray2270 {
    public static void main(String[] args) {
        System.out.println(waysToSplitArray(new int[]{2,3,1,0}));
    }

    public static int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }
}