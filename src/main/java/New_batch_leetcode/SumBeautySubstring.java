package New_batch_leetcode;

import java.util.Arrays;

public class SumBeautySubstring {
    public static int beautySum(String s) {
        int n = s.length();
        int sumOfBeauty = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // Array to store frequency of each character in the substring
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++; // Increment the frequency of the current character
                sumOfBeauty += getBeauty(freq);
            }
            System.out.println(Arrays.toString(freq));
        }

        return sumOfBeauty;
    }

    private static int getBeauty(int[] freq) {
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;

        for (int count : freq) {
            if (count > 0) {
                maxFreq = Math.max(maxFreq, count);
                minFreq = Math.min(minFreq, count);
            }
        }
        System.out.println(maxFreq+" "+minFreq);
        return maxFreq - minFreq;
    }

    public static void main(String[] args) {
        String s = "aabcb";
        int result = beautySum(s);
        System.out.println("Sum of Beauty of all substrings: " + result);
    }
}
