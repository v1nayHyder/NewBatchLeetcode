package New_batch_leetcode;
/*
930. Binary Subarrays With Sum
Medium
Topics
Companies
Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.



Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15


Constraints:

1 <= nums.length <= 3 * 104
nums[i] is either 0 or 1.
0 <= goal <= nums.length
 */
public class BinarySubArraySum {
    //Total Time Complexity: O(n)
    //Total Space Complexity: O(1)
    public static int numSubarraysWithSum(int[] nums, int goal) {
        if (goal < 0)
            return 0; // Time Complexity: O(1), Space Complexity: O(1)
        int start = 0, end = 0, count = 0, sum = 0;
        while (end < nums.length) { // Time Complexity: O(n), Space Complexity: O(1)
            sum += nums[end];
            while (sum > goal) { // Time Complexity: O(n), Space Complexity: O(1)
                sum -= nums[start];
                start++;
            }
            count += end - start + 1;
            end++;
        }
        return count; // Time Complexity: O(n), Space Complexity: O(1)
    }

    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }
}
