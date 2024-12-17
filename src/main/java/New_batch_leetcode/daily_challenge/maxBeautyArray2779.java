package New_batch_leetcode.daily_challenge;

import java.util.Arrays;


public class maxBeautyArray2779 {
    public static int maximumBeauty(int[] nums, int k) {
                Arrays.sort(nums); // Sort the array for easier range calculation
                int max = 0, left = 0;

                // Sliding window to count elements within the range
                for (int right = 0; right < nums.length; right++) {
                    // Shrink the window if the difference exceeds `2 * k`
                    while (nums[right] - nums[left] > 2 * k) {
                        left++;
                    }
                    max = Math.max(max, right - left + 1);
                }

                return max;
            }


        public static void main(String[] args) {
        System.out.println(maximumBeauty(new int[]{4,6,1,2},2));
    }
}
