package New_batch_leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
540. Single Element in a Sorted Array
Medium
Topics
Companies
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.



Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10


Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
 */
public class FindEleAppearsOnce {

    public static int singleNonDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // Space: O(n)

        // Iterate through nums array
        // Time: O(n), where n is the length of nums
        for (int num : nums) {
            if (!set.add(num)) { // If num already exists in set
                set.remove(num); // Remove it (since each number appears exactly twice)
            }
        }

        // After the loop, set will contain only the single non-duplicate number
        // Time: O(1)
        return set.iterator().next(); // Time: O(1)
    }


/* optimal approach
Total Time Complexity: O(n)
- Iterating through nums array: O(n)
- Adding to HashSet and removing if exists: O(1) on average
- Overall: O(n)

Total Space Complexity: O(n)
- Space for HashSet: O(n)
*/


//    public static int singleNonDuplicate(int[] nums) {
//        int num = 0; // Space: O(1)
//
//        // Iterate through nums array
//        // Time: O(n^2), where n is the length of nums
//        for (int i = 0; i < nums.length; i++) {
//            num = nums[i]; // Time: O(1)
//            int count = 0; // Space: O(1)
//
//            // Count occurrences of num in nums
//            // Time: O(n), where n is the length of nums
//            for (int j = 0; j < nums.length; j++) {
//                if (num == nums[j]) { // Time: O(1)
//                    count++; // Time: O(1)
//                }
//            }
//
//            // If num appears only once, return it
//            // Time: O(1)
//            if (count == 1) {
//                return num; // Time: O(1)
//            }
//        }
//
//        return 0; // Time: O(1)
//    }
    /*bruth force approach
Total Time Complexity: O(n^2)
- Iterating through nums array: O(n)
- Counting occurrences inside the loop: O(n)
- Overall: O(n) * O(n) = O(n^2)

Total Space Complexity: O(1)
- No extra space used that grows with input size
*/

//    public static int singleNonDuplicate(int[] nums) {
//        Stack<Integer> stack = new Stack<>(); // Space: O(n)
//
//        // Iterate through the nums array
//        // Time: O(n), where n is the length of nums
//        for (int num : nums) {
//            if (stack.contains(num)) { // Time: O(n) in worst case due to contains() method
//                stack.pop(); // Time: O(1)
//            } else {
//                stack.push(num); // Time: O(1)
//            }
//        }
//
//        return stack.peek(); // Time: O(1)
//    }
    /*better  approach
    Total Time Complexity: O(n^2)
    - Iterating through nums array: O(n)
    - Using contains() inside the loop: O(n)
    - Overall: O(n) * O(n) = O(n^2)

    Total Space Complexity: O(n)
    - Space for Stack: O(n)
    */
    public static void main(String[] args) {
   int nums[] = {1,1,2,3,3,4,4,8,8};
   System.out.println(singleNonDuplicate(nums));

    }
}
