package New_batch_leetcode.striver_cheet_sheet.Arrays;

public class LonSubArrayWthSumKGFG{
    public static void main(String[] args) {
        System.out.println(lenOfLongestSubarr(new int[]{10, 5, 2, 7, 1, 9},15));
    }
    public static int lenOfLongestSubarr(int[] arr, int k) {
        int start=0;
        int end=0;
        int sum=arr[0];
        int maxLength=0;
        while (end<arr.length) {
            while (start <= end && sum > k) {
                sum -= arr[start];
                start++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
            end++;
            if (end < arr.length) {
                sum += arr[end];

            }
        }

        return maxLength;
    }
}
