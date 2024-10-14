package New_batch_leetcode;
/*
1358. Number of Substrings Containing All Three Characters
Medium
Topics
Companies
Hint
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.



Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
Example 3:

Input: s = "abc"
Output: 1


Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.
 */
public class NumSubStrConThrChar {
    public static int numberOfSubstrings(String s) {
        /*
Time Complexity Analysis:
- Initializing the lastSeen array: O(1)
- Initializing the count variable: O(1)
- For loop running over the string: O(n), where n is the length of the string
  - Inside the loop:
    - Updating lastSeen array: O(1)
    - Checking if condition: O(1)
    - Calculating count using min function: O(1)
- Returning the count: O(1)

         */
//        int lastSeen[] = {-1, -1, -1}; // O(1) space
//        int count = 0; // O(1) space
//        for (int i = 0; i < s.length(); i++) { // O(n) time, where n is the length of the string
//            lastSeen[s.charAt(i) - 'a'] = i; // O(1) time
//            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) { // O(1) time
//                count += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])); // O(1) time
//            }
//
//        }
//        return count; // O(1) time
//    }
        int lastSeen[] = new int[3]; // O(1) space
        int count = 0; // O(1) space
        int start=0;
        for (int i = 0; i < s.length(); i++) { // O(n) time, where n is the length of the string
            lastSeen[s.charAt(i) - 'a']++; // O(1) time

         while (lastSeen[0]>=1&&lastSeen[1]>=1&&lastSeen[2]>=1){
             count+=(s.length()-i);
             lastSeen[s.charAt(start++)-'a']--;
         }

        }
        return count; // O(1) time
    }

    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(numberOfSubstrings(str));  // Output should be 10
    }
}
