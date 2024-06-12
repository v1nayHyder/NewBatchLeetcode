package New_batch_leetcode;

import java.util.HashMap;
import java.util.Map;
/*76. Minimum Window Substring
Hard
Topics
Companies
Hint
Given two strings s and t of lengths m and n respectively, return the minimum window
substring
 of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.


Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.

 */
public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length())
            return "";

        // O(m) time, O(m) space
        Map<Character, Integer> frequencyChar = new HashMap<>();
        for (char c : t.toCharArray()) {
            frequencyChar.put(c, frequencyChar.getOrDefault(c, 0) + 1);
        }

        int n = s.length(), m = t.length(), left = 0, right = 0;
        int minLength = Integer.MAX_VALUE, sIndex = -1, count = 0;
        // O(1) space for primitive variables
        Map<Character, Integer> windowCounts = new HashMap<>();

        // O(n) time loop, where n is the length of s
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            // O(1) time
            if (frequencyChar.containsKey(rightChar)) {
                // O(1) time
                windowCounts.put(rightChar, windowCounts.getOrDefault(rightChar, 0) + 1);
                // O(1) time
                if (windowCounts.get(rightChar).intValue() <= frequencyChar.get(rightChar).intValue()) {
                    count++;
                }
            }

            // The inner while loop runs in O(n) time in total
            while (count == m) {
                // O(1) time
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    sIndex = left;
                }

                char leftChar = s.charAt(left);
                // O(1) time
                if (frequencyChar.containsKey(leftChar)) {
                    // O(1) time
                    windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                    // O(1) time
                    if (windowCounts.get(leftChar).intValue() < frequencyChar.get(leftChar).intValue()) {
                        count--;
                    }
                }
                left++;
            }
            right++;
        }

        // O(1) time for returning the result
        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLength);

        // Total Time Complexity: O(m + n)
        // Total Space Complexity: O(m)
    }
    public static void main(String[] args) {
    String s = "ADOBECODEBANC", t = "ABC";
    System.out.println(minWindow(s,t));
    }
}
