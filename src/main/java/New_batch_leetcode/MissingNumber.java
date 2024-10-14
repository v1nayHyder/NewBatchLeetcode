package New_batch_leetcode;

import java.util.HashSet;
/*
268. Missing Number
Solved
Easy
Topics
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.


Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length; // Space: O(1)

        // Calculate the sum of numbers from 1 to n using the formula
        // Time: O(1)
        int total = n * (n + 1) / 2; // Time: O(1)

        // Calculate the actual sum of elements in the nums array
        // Time: O(n)
        int sum = 0; // Space: O(1)
        for (int num : nums) {
            sum += num; // Time: O(1)
        }

        // Return the missing number by subtracting the actual sum from the expected sum
        // Time: O(1)
        return total - sum; // Time: O(1)
    }
/* optimal approach
Total Time Complexity: O(n)
- Calculating sum of nums: O(n)

Total Space Complexity: O(1)
- No extra space used that grows with input size
*/

//    public static int missingNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<>(); // Space: O(n)
//
//        // Add all elements from nums to HashSet
//        // Time: O(n)
//        for (int num : nums) {
//            set.add(num); // Time: O(1) on average
//        }
//
//        // Check for missing number from 0 to nums.length
//        // Time: O(n)
//        for (int i = 0; i <= nums.length; i++) {
//            if (!set.contains(i)) { // Time: O(1) on average
//                return i; // Time: O(1)
//            }
//        }
//
//        return -1; // In case no missing number found (this should ideally not happen)
//    }
/* best for approach
Total Time Complexity: O(n)
- Adding elements to HashSet: O(n)
- Checking for missing number: O(n)

Total Space Complexity: O(n)
- Space for HashSet: O(n)
*/


    //    public static int missingNumber(int[] nums) {
//        // Loop from 1 to nums.length
//        // Time: O(n) for the outer loop
//        for (int i = 1; i <= nums.length; i++) {
//            int flag = 0; // Space: O(1)
//
//            // Loop through the nums array
//            // Time: O(n) for the inner loop
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] == i) { // Time: O(1)
//                    flag = 1; // Time: O(1)
//                    break; // Time: O(1)
//                }
//            }
//
//            // If flag is still 0, return the missing number
//            if (flag == 0) { // Time: O(1)
//                return i; // Time: O(1)
//            }
//        }
//
//        // If no number is missing, return 0
//        return 0; // Time: O(1)
//    }
    /* bruth force approach
    Total Time Complexity: O(n^2)
    - Outer loop: O(n)
    - Inner loop: O(n)
    - Overall: O(n) * O(n) = O(n^2)

    Total Space Complexity: O(1)
    - Space for flag variable: O(1)
    - No additional space is used that grows with input size
    */
    public static void main(String[] args) {
        int nums[]={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
        }
