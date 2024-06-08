package New_batch_leetcode;
/*
1004. Max Consecutive Ones III
Medium
Topics
Companies
Hint
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.



Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
 */
public class MaxConsecutiveOne {
    public static int longestOnes(int[] nums, int k) {
        int maxLength = 0;   // O(1) space
        int left = 0;       // O(1) space
        int right = 0;      // O(1) space
        int zero = 0;       // O(1) space
//        while ()
  return 0;
    }

/*

// Total time complexity: O(n)
// Total space complexity: O(1)
    public static int longestOnes(int[] nums, int k) {
        int maxLength = 0;   // O(1) space
        int left = 0;       // O(1) space
        int right = 0;      // O(1) space
        int zero = 0;       // O(1) space

        // Outer while loop iterates over the array, time complexity O(n)
        while (right < nums.length) {
            if (nums[right] == 0) {
                zero++;  // O(1) time
            }

            // Inner while loop ensures the number of zeros in the window is at most k
            while (zero > k) {
                if (nums[left] == 0) {
                    zero--;  // O(1) time
                }
                left++;  // O(1) time
            }

            // Calculate the maximum length of the window
            int length = right - left + 1;   // O(1) time
            maxLength = Math.max(maxLength, length);  // O(1) time

            right++;  // Move right pointer to the next element, O(1) time
        }

        return maxLength;  // O(1) time
    }


 */

    /*

    // Total time complexity: O(n^2)
// Total space complexity: O(1)
    public static int longestOnes(int[] nums, int k) {
        int zero = 0;           // O(1) space
        int maxLength = 0;      // O(1) space

        // Outer loop: iterates over the array, time complexity O(n)
        for (int i = 0; i < nums.length; i++) {
            zero = 0;  // Reset zero count for each new start position, O(1) time

            // Inner loop: iterates over the subarray starting at i, time complexity O(n)
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zero++;  // O(1) time
                }
                if (zero <= k) {
                    int length = j - i + 1;   // O(1) time
                    maxLength = Math.max(maxLength, length);  // O(1) time
                } else {
                    break;  // Breaks out of the inner loop, O(1) time
                }
            }
        }

        return maxLength;  // O(1) time
    }

     */



    public static void main(String[] args) {
        int ones[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(ones,k));

    }
}
