package New_batch_leetcode;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String name="Vinay Prakash Yadav";
        char chars[]=name.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            char ch=chars[i];



            chars[chars.length-1-i]=ch;
        }
        System.out.println("done");
        System.out.println(new String(chars));
    }
}
