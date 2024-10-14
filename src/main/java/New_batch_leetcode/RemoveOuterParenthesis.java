package New_batch_leetcode;

import java.util.Stack;

public class RemoveOuterParenthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();

    }
    public static void main(String[] args) {
        String str="(())";
        String result=removeOuterParentheses(str);
        System.out.println(result);

    }
}
