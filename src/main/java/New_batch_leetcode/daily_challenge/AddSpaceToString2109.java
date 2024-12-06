package New_batch_leetcode.daily_challenge;

import java.util.Arrays;
import java.util.List;

public class AddSpaceToString2109 {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder stringBuilder=new StringBuilder();
        int start=0;
        int space=0;
        while (start<spaces[spaces.length-1]){
            if(start==spaces[space]){
                stringBuilder.append(' ');
                space++;
            }
            stringBuilder.append(s.charAt(start));

            start++;
        }

        return  stringBuilder+" "+s.substring(start);
    }
    public static void main(String[] args) {
        System.out.println(addSpaces("icodeinpython",new int[]{1,5,7,9}));
    }
}
