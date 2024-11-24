package New_batch_leetcode.daily_challenge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxSumDisSubArrayWithK2461 {
    public static long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        int start = 0;
        int n = nums.length;
        long sum = 0;
        Map<Integer, Integer> countFreq = new HashMap<>();

        for (int end = 0; end < n; end++) {
            sum += nums[end];

            countFreq.put(nums[end], countFreq.getOrDefault(nums[end], 0) + 1);

            while (countFreq.get(nums[end]) > 1) {
                countFreq.put(nums[start], countFreq.get(nums[start]) - 1);
                sum -= nums[start];
                start++;
            }

            if (end - start + 1 == k) {
                max = Math.max(max, sum);

                sum -= nums[start];
                countFreq.put(nums[start], countFreq.get(nums[start]) - 1);
                start++;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int nums[]={1,5,4,2,9,9,9};
        int k=3;
        System.out.println(maximumSubarraySum(nums,k));
    }

}
