package New_batch_leetcode;

import java.util.Stack;
/*150. Evaluate Reverse Polish Notation
Solved
Medium
Topics
Companies
You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.


Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22


Constraints:

1 <= tokens.length <= 104
tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

 */
public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        // Time complexity: O(n), where n is the number of tokens
        // Space complexity: O(n), where n is the number of tokens
        Stack<Integer> stack = new Stack<>(); // Time: O(1), Space: O(n)
        for (String token : tokens) { // Time: O(n), Space: O(1)
            if (isToken(token)) { // Time: O(1), Space: O(1)
                int num2 = stack.pop(); // Time: O(1), Space: O(1)
                int num1 = stack.pop(); // Time: O(1), Space: O(1)
                if (token.equals("+")) { // Time: O(1), Space: O(1)
                    stack.push(num1 + num2); // Time: O(1), Space: O(1)
                } else if (token.equals("-")) { // Time: O(1), Space: O(1)
                    stack.push(num1 - num2); // Time: O(1), Space: O(1)
                } else if (token.equals("*")) { // Time: O(1), Space: O(1)
                    stack.push(num1 * num2); // Time: O(1), Space: O(1)
                } else if (token.equals("/")) { // Time: O(1), Space: O(1)
                    stack.push(num1 / num2); // Time: O(1), Space: O(1)
                }
            } else {
                stack.push(Integer.parseInt(token)); // Time: O(1), Space: O(1)
            }
        }
        return stack.pop(); // Time: O(1), Space: O(1)
    }

    static boolean isToken(String tok) {
        return (tok.equals("+") || tok.equals("-") || tok.equals("*") || tok.equals("/"));
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}
