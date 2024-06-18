package New_batch_leetcode;
/*560. Subarray Sum Equals K
Attempted
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2


Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107

 */
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
//        int count =0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int count = 0;
                for (int l = i; l < j; l++) {
                    if (count == k) {
                        max = Math.max(max, j - i + 1);

                    }

                }

            }
        }
        System.out.println(max);
//        System.out.println(count);
        return 0;
    }
    public static void main(String[] args) {
    int nums[]={1,1,1};
    int k=2;
        System.out.println(subarraySum(nums,k));
    }
}
