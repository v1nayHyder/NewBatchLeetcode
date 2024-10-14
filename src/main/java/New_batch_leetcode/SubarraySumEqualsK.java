package New_batch_leetcode;

import java.util.HashMap;
import java.util.Map;

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
    //optimal solution
    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int preSum=0,count=0;
        map.put(0,1);
        for (int i = 0; i <nums.length ; i++) {
            preSum=preSum+nums[i];
            int remove=preSum-k;
            count=count+map.getOrDefault(remove,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }

// brute force approach
   /* public static int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;

    }

    */
    public static void main(String[] args) {
    int nums[]={1,2,3};
    int k=3;
        System.out.println(subarraySum(nums,k));
    }
}
