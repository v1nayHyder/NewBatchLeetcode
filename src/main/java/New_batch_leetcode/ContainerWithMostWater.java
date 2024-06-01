package New_batch_leetcode;
/*
11. Container With Most Water
Medium
Topics
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.



Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1


Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */
public class ContainerWithMostWater {
   /* Time Complexity: O(n)
    The function uses a two-pointer approach to iterate through the array.
            Both pointers (left and right) traverse the array at most once from start to end.
    Thus, the loop runs in linear time, resulting in a time complexity of
    𝑂
            (
                    𝑛
                    )
    O(n).
    Space Complexity: O(1)
    The function uses a constant amount of extra space.
    The space required does not depend on the size of the input array, so the space complexity is
    𝑂
            (
1
            )
    O(1).

    */
    public static int maxArea(int[] height) {
        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int left = 0; // O(1) time, O(1) space
        int right = height.length - 1; // O(1) time, O(1) space
        int maxWater = 0; // O(1) time, O(1) space

        // The while loop runs in O(n) time because each pointer moves at most n times
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left); // O(1) time, O(1) space
            maxWater = Math.max(area, maxWater); // O(1) time, O(1) space

            if (height[left] < height[right]) { // O(1) time for comparison
                left++; // O(1) time
            } else {
                right--; // O(1) time
            }
        }

        return maxWater; // O(1) time
    }

    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
