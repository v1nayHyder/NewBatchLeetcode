package New_batch_leetcode;

import java.nio.file.Watchable;
import java.util.Stack;

/*
2544. Alternating Digit Sum
Easy
Topics
Companies
Hint
You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.



Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.


Constraints:

1 <= n <= 109

 */
public class AlternatingDigitSum {
    public static int alternateDigitSum(int n) {
        int sum = 0;
        boolean add = true; // Toggle flag to alternate between addition and subtraction

        while (n > 0) {
            int digit = n % 10;
            if (add) {
                sum += digit;
                System.out.println(digit);
            } else {
                sum -= digit;

            }
            add = !add; // Toggle the flag
            n /= 10;
        }

        return sum;
    }

    /*
    public static int alternateDigitSum(int n) {
        // O(1) time, O(1) space
        Stack<Integer> stack = new Stack<>();

        // O(d) time, O(d) space
        while (n > 0) {
            stack.push(n % 10);
            n /= 10;
        }

        // O(1) time, O(1) space
        int sum = 0, i = 0;

        // O(d) time, O(1) space (excluding stack)
        while (!stack.isEmpty()) {
            if (i == 0) {
                sum += stack.pop();
                i++;
            } else {
                sum -= stack.pop();
                i--;
            }
        }

        // O(1) time, O(1) space
        return sum;
    }
   // Total Time Complexity: O(d)
   // Total Space Complexity: O(d)

     */
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(4521));

    }
}
