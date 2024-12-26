package New_batch_leetcode.daily_challenge;

public class TargetSum494 {
    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1},3));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Check if the target sum is achievable
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }

        int newTarget = (sum + target) / 2;

        // Initialize the dp array with size newTarget + 1
        int[] dp = new int[newTarget + 1];
        dp[0] = 1;

        // Update dp array using the given nums array
        for (int num : nums) {
            for (int i = newTarget; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        return dp[newTarget];
    }
}
