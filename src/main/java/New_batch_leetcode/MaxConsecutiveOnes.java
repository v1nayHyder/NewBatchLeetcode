package New_batch_leetcode;
/*
485. Max Consecutive Ones
Solved
Easy
Topics
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.



Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2


Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0; // Space: O(1)
        int count = 0; // Space: O(1)

        // Iterate through the nums array
        // Time: O(n), where n is the length of nums
        for (int num : nums) {
            if (num == 1) { // Time: O(1)
                count++; // Time: O(1)
                max = Math.max(max, count); // Time: O(1)
            } else {
                count = 0; // Time: O(1)
            }
        }

        return max; // Space: O(1)
    }

    /*optimal approach
    Total Time Complexity: O(n)
    - Iterating through nums array: O(n)

    Total Space Complexity: O(1)
    - No extra space used that grows with input size
    */
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
