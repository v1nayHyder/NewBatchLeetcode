package New_batch_leetcode;

import java.util.Arrays;

/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
public class LongestConsecutiveSequence {
} */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);
        int start=nums[0];
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
           if(nums[i]!=nums[i+1]){
            if (nums[i]==start++){
                count++;
            }
            else
                break;}
        }
        if (start==nums[nums.length-1])
            count++;
     return count;
    }

    public static void main(String[] args) {
     int result=   longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6});
        System.out.println(result);
    }
}
