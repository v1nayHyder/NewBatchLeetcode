package New_batch_leetcode;

import java.util.HashMap;
import java.util.Map;

/*
424. Longest Repeating Character Replacement
Medium
Topics
Companies
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.



Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.


Constraints:

1 <= s.length <= 105
s consists of only uppercase English letters.
0 <= k <= s.length
 */
public class LongReaCharReplace {
    public  static int characterReplacement(String s, int k) {
        int n = s.length(); // O(1) time, O(1) space
        int maxLen = 0; // O(1) space
        int[] count = new int[26]; // O(1) space
        int maxCount = 0; // O(1) space
        int left = 0; // O(1) space

        // Outer loop runs n times
        for (int right = 0; right < n; right++) { // O(n) time
            char c = s.charAt(right); // O(1) time
            count[c - 'A']++; // O(1) time
            maxCount = Math.max(maxCount, count[c - 'A']); // O(1) time

            // Adjust the left pointer to maintain the condition
            while ((right - left + 1) - maxCount > k) { // Up to O(n) time in total
                char leftChar = s.charAt(left); // O(1) time
                count[leftChar - 'A']--; // O(1) time
                left++; // O(1) time
            }

            maxLen = Math.max(maxLen, right - left + 1); // O(1) time
        }

        return maxLen; // O(1) time
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println("Longest length: " + characterReplacement(s, k));  // Output should be 4
    }


/*
 * Total Time Complexity:
 * - The outer loop runs n times: O(n)
 * - The inner while loop can run up to n times in total across all iterations of the outer loop: O(n)
 * - Other operations inside the loops are O(1)
 * - Therefore, the overall time complexity is O(n).
 *
 * Total Space Complexity:
 * - The space used by the count array is O(1) since its size is fixed at 26 (for uppercase English letters)
 * - Additional space for variables n, maxLen, maxCount, left, and right is O(1)
 * - Therefore, the overall space complexity is O(1).
 */
}
    /*
    public static int characterReplacement(String s, int k) {
            int n = s.length();
            int maxLen = 0;

            // Outer loop runs n times
            for (int i = 0; i < n; i++) {
                HashMap<Character, Integer> countMap = new HashMap<>();
                int maxCount = 0;

                // Inner loop runs (n-i) times for each i
                for (int j = i; j < n; j++) {
                    char c = s.charAt(j);
                    countMap.put(c, countMap.getOrDefault(c, 0) + 1);
                    maxCount = Math.max(maxCount, countMap.get(c));

                    // Current window size is j - i + 1
                    // Number of characters to change to make all characters same is (j - i + 1 - maxCount)
                    if ((j - i + 1) - maxCount <= k) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }

            return maxLen;
        }

        public static void main(String[] args) {
            String s = "AABABBA";
            int k = 1;
            System.out.println("Longest length: " + characterReplacement(s, k));  // Output should be 4
        }
    }

     */

/*
 * Time Complexity:
 * - The outer loop runs n times.
 * - The inner loop runs (n - i) times for each i from 0 to n-1.
 * - Counting character frequencies inside the inner loop takes O(1) time for each character.
 * - Therefore, the overall time complexity is O(n^3) in the worst case.
 *
 * Space Complexity:
 * - The space used by the hash map countMap is O(1) in the worst case since it stores at most 26 key-value pairs (assuming only uppercase English letters).
 * - The additional space used for variables maxCount and maxLen is O(1).
 * - Therefore, the overall space complexity is O(1).
 */
