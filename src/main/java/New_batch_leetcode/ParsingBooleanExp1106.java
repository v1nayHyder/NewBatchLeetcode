package New_batch_leetcode;

import java.util.Stack;

public class ParsingBooleanExp1106 {
    public static boolean parseBoolExpr(String expression) {

    Stack<Character> stack=new Stack<>();
        for (char c:expression.toCharArray()){
        if(c==','||c=='('){
            continue;
        }
        else if (c=='&'||c=='|'||c=='!'||c=='f'||c=='t'){
            stack.push(c);
        }
        else {
            boolean doesStackHaveTrue=false,
                    doesStackHaveFalse=false;
            while (stack.peek()!='&'&&stack.peek()!='!'&&stack.peek()!='|'){
                char val=stack.pop();
                if (val=='t'){
                    doesStackHaveTrue=true;
                }
                else if (val=='f'){
                    doesStackHaveFalse=true;
                }
            }
            char op=stack.pop();
            if (op=='&'){
                if (doesStackHaveFalse){
                    stack.push('f');
                }
                else {
                    stack.push('t');
                }

            }
            else if (op=='|'){
                if (doesStackHaveTrue){
                    stack.push('t');
                }
                else {
                    stack.push('f');
                }
            }
            else if (op=='!'){
                if (doesStackHaveTrue){
                    stack.push('f');
                }
                else {
                    stack.push('t');
                }
            }
        }
    }
        return stack.peek()=='t'?true:false;

}
    public static void main(String[] args) {
        System.out.println(parseBoolExpr("|(f,f,f,t)"));
    }
}
