package New_batch_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfDigit {
    public static int count(String str){
        String newStr[]=str.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for (String s: newStr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
        String st2 = "jased,techolo";
        return newStr.length;

//        int count=1;
//        if(str==null){
//            return 0;
//        }
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==' '){
//                count++;
//            }
//        }
//        return count;

    }

    public static void main(String[] args) {
        String str="the quick brown fox jumps over the lazy dog the dog jumps over the fox";
        System.out.println(count(str));
    }
}
