package New_batch_leetcode;

import java.util.HashMap;

/*
169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        for (int i = 0; i <nums.length ; i++) {
             if (count==0){
                 count++;
                 ele=nums[i];
             }
             else if (ele==nums[i]) {
                 count++;
             }
             else {
                 count--;
             }
        }
       int count1=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]==ele)
                count1++;
            if (count1>nums.length/2)
                return nums[i];

        }
        return 0;
    }

    /*    //brute force approach
        public static int majorityElement(int[] nums) {
            for(int i=0;i<nums.length-1;i++){
                int count=1;
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i]==nums[j]){
                        count++;
                    }
                }
                if (count>nums.length/2)
                    return nums[i];
            }
        return 0;
            // Total Time complexity of outer loop: O(n) * O(n) = O(n^2)
            // Total Space complexity of outer loop: O(1)
        }

     */

       /* better approach
        public static int majorityElement(int[] nums) {
        // Line 1: HashMap initialization
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // Time complexity: O(1)
        // Space complexity: O(1)

        // Line 2-4: Populate the HashMap
        for (int i = 0; i < nums.length; i++) {
            // Time complexity of loop: O(n)
            // Space complexity of loop: O(1)

            // Line 3: Put element into HashMap and update its count
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            // Time complexity for each put operation: O(1) on average
            // Space complexity: O(n) in total as the HashMap grows with input size
        }

        // Line 5-7: Iterate over the HashMap to find the majority element
        for (int num : hashMap.keySet()) {
            // Time complexity of loop: O(n)
            // Space complexity of loop: O(1)

            // Line 6: Check if the count of the current element is greater than n/2
            if (hashMap.get(num) > nums.length / 2)
                // Time complexity for each get operation: O(1)
                return num;
            // Space complexity: O(1)
        }

        // Line 8: Return statement
        return 0;
        // Total Time complexity so far: O(n) + O(n) = O(2n) = O(n)
        // Total Space complexity so far: O(n)
    }

        */
    public static void main(String[] args) {
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    }
}
