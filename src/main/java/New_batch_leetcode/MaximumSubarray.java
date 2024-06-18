package New_batch_leetcode;
/*53. Maximum Subarray
Medium
Topics
Companies
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.


 */
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        // Initialize sum to 0 and max to the smallest possible integer value
        int sum = 0, max = Integer.MIN_VALUE;

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the sum
            sum = sum + nums[i];

            // Update max if the current sum is greater than the previous max
            max = Math.max(sum, max);

            // If sum is negative, reset it to 0
            if (sum < 0) {
                sum = 0;
            }
        }

        // Return the maximum sum found
        return max;
    }

    /*
     * Time Complexity:
     * O(n) - The loop runs n times, where n is the length of the array.
     *
     * Space Complexity:
     * O(1) - Only a fixed amount of extra space is used (sum and max).
     */


/* brute force approach
    public static int maxSubArray(int[] nums) {
        // Initialize max to the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Iterate over the start index of the subarray
        for (int i = 0; i < nums.length; i++) {
            // Initialize sum for the current subarray starting at index i
            int sum = 0;

            // Iterate over the end index of the subarray
            for (int j = i; j < nums.length; j++) {
                // Add the current element to the sum
                sum += nums[j];

                // Update max if the current sum is greater than the previous max
                max = Math.max(max, sum);
            }
        }

        // Return the maximum sum found
        return max;
    }

    /*
     * Time Complexity:
     * The outer loop runs n times, where n is the length of the array.
     * For each iteration of the outer loop, the inner loop runs (n - i) times.
     * This results in a total of 1 + 2 + 3 + ... + n = n * (n + 1) / 2 iterations.
     * Hence, the time complexity is O(n^2).
     *
     * Space Complexity:
     * The space complexity is O(1) because we are using only a fixed amount of extra space
     * (for the variables max and sum), regardless of the input size.
     */

    public static void main(String[] args) {
    int nums[]={-2,-1};
        System.out.println(maxSubArray(nums));
    }
}
