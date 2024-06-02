package New_batch_leetcode;

import java.util.HashSet;

/*
1876. Substrings of Size Three with Distinct Characters
Easy
Topics
Companies
Hint
A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.



Example 1:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz".
Example 2:

Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".


Constraints:

1 <= s.length <= 100
s​​​​​​ consists of lowercase English letters.
 */
public class CountGoodSubString {
    public static int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            if (areAllCharactersDistinct(substring)) {
                count++;
            }
        }

        return count;
    }

    private static boolean areAllCharactersDistinct(String s) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }


}
