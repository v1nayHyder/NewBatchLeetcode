package New_batch_leetcode;

import java.util.Arrays;
/*
Code
Testcase
Test Result
Test Result
238. Product of Array Except Self
Solved
Medium
Topics
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.



Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */
public class ProductOfArray {
    //this is bruth force algorithms

    /**
     * Returns an array such that each element at index i of the array is the product of all the numbers
     * in the input array except the one at i. This is a brute force algorithm.
     *
     *  (nums) The input array of integers.
     * @return An array where each element is the product of all elements of the input array except itself.
     */
   /* public static int[] productExceptSelf(int[] nums) {
        // Time Complexity: O(N^2)
        // - We have two nested loops: the outer loop runs N times and the inner loop also runs N times for each
        //   iteration of the outer loop.
        // - Total: O(N * N) = O(N^2)

        // Space Complexity: O(N)
        // - We create a new array `newNums` of the same size as the input array to store the result.
        // - Additional space used is proportional to the input size.
        // - Total: O(N)

        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {  // Ensure we do not multiply the element by itself
                    temp = temp * nums[j];
                }
            }
            newNums[i] = temp;
        }
        return newNums;
    }  */

    /*bruth force approach using divison
        public static int[] productExceptSelf(int[] nums) {

        int temp=1;
            for (int i = 0; i <nums.length ; i++) {
                temp=temp*nums[i];
            }
            for (int i = 0; i <nums.length ; i++) {
                nums[i]=temp/nums[i];
            }
            return nums;
        }
     */
  /*  public static int[] productExceptSelf(int[] nums) {
     int[] prefix=new int[nums.length];
     int[] postfix=new int[nums.length];
        for (int i = 0,temp=1; i <nums.length ; i++) {
            prefix[i]=temp;
            temp*=nums[i];

        }
        System.out.println(Arrays.toString(prefix));

        for (int i = nums.length-1,temp=1; i >=0 ; i--) {
            postfix[i]=temp;
            temp*=nums[i];

        }
        System.out.println(Arrays.toString(postfix));

        int result[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i]=prefix[i]*postfix[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

   */
    /**
     * Returns an array such that each element at index i of the array is the product of all the numbers
     * in the input array except the one at i.
     *
     * @param nums The input array of integers.
     * @return An array where each element is the product of all elements of the input array except itself.
     */
    public static int[] productExceptSelf(int[] nums) {
        // Time Complexity: O(N)
        // - We make two passes over the array, each taking O(N) time.
        // - Total: O(N)

        // Space Complexity: O(1) (excluding the output array)
        // - We use a constant amount of extra space for temporary variables.
        // - Total: O(1)

        int n = nums.length;
        int[] result = new int[n];

        // Compute prefix products and store in result array
        for (int i = 0, temp = 1; i < n; i++) {
            result[i] = temp;
            temp *= nums[i];
        }

        // Compute postfix products and update result array
        for (int i = n - 1, temp = 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int[] result=productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
