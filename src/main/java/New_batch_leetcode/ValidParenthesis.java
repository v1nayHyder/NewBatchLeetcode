package New_batch_leetcode;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String st="()()()()()()()()()()()()())";
        Stack<Character> stack=new Stack<>();
        for(char ch:st.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    System.out.println("not Valid parenthensis");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid parenthensis");
        }
        else {
            System.out.println("not Valid  parenthensis");

        }
    }
}
