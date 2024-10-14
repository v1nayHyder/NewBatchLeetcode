package New_batch_leetcode;

import java.util.Stack;

public class MaxNestingParethesis {

    public static int maxDepth(String s) {
        Stack<Character> characters=new Stack<>();

        int max = 0;
        int i = 0;
        int count = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if( ch == '('){
                characters.push(ch);
                count ++;
            }
            if(ch == ')'){
                characters.pop();
                if(max < count){
                    max = count;
                }
                count -= 1;

            }
            i++;

        }
        return max;
//        int count=-1;
//        for (int i = 0; i <s.length() ; i++) {
//            if (s.charAt(i)==')'){
//                characters.pop();
//                if(characters.size()!=1)
//                  count++;
//
//            }
//            else if(s.charAt(i)=='(') {
//                characters.push(s.charAt(i));
//            }
//        }
//        System.out.println(characters+" "+count);
//        return -1;
    }
    public static void main(String[] args){
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
