package New_batch_leetcode.striver_cheet_sheet.basic_hashing;

import java.util.Arrays;

public class FreOfMostFreEle1836 {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        int left = 0, n = nums.length;
        long total = 0; // Use long to handle larger sums
        int maxfre = 0;

        for (int right = 0; right < n; right++) {
            total += nums[right]; // Add current element to total

            // Check if the window is valid
            while ((long) nums[right] * (right - left + 1) > total + k) {
                total -= nums[left]; // Remove leftmost element from total
                left++; // Shrink the window
            }

            // Update max frequency
            maxfre = Math.max(maxfre, right - left + 1);
        }

        return maxfre;

    }
    public static void main(String[] args) {

        System.out.println(maxFrequency(new int[]{1,2,4},5));
    }
}
