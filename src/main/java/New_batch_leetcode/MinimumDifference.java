package New_batch_leetcode;

import java.util.Arrays;

/*
1984. Minimum Difference Between Highest and Lowest of K Scores
Easy
Topics
Companies
Hint
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.



Example 1:

Input: nums = [90], k = 1
Output: 0
Explanation: There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.
Example 2:

Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.


Constraints:

1 <= k <= nums.length <= 1000
0 <= nums[i] <= 105
 */
public class MinimumDifference {
    // Total Time Complexity: O(n log n)
// Total Space Complexity: O(1)
    public static int minimumDifference(int[] nums, int k) {
        // Sorting the array
        // Time complexity: O(n log n)
        // Space complexity: O(1) (assuming Arrays.sort uses a constant amount of extra space)
        Arrays.sort(nums);

        // Initialize min to the maximum possible integer value
        // Time complexity: O(1)
        // Space complexity: O(1)
        int min = Integer.MAX_VALUE;

        // Initialize start to 0
        // Time complexity: O(1)
        // Space complexity: O(1)
        int start = 0;

        // Initialize check to k-1
        // Time complexity: O(1)
        // Space complexity: O(1)
        int check = k-1;

        // Loop through the array while check is within bounds
        // Time complexity: O(n)
        // Space complexity: O(1)
        while (start <= nums.length - k) {
            // Calculate the minimum difference
            // Time complexity: O(1)
            // Space complexity: O(1)
            min = Math.min(min, nums[check] - nums[start]);

            // Increment start
            // Time complexity: O(1)
            // Space complexity: O(1)
            start++;

            // Increment check
            // Time complexity: O(1)
            // Space complexity: O(1)
            check++;
        }

        // Return the minimum difference
        // Time complexity: O(1)
        // Space complexity: O(1)
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{87063,61094,44530,21297,95857,93551,9918},6));
    }
}
