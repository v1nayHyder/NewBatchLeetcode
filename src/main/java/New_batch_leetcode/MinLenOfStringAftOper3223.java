package New_batch_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinLenOfStringAftOper3223 {
    public static void main(String[] args) {


        System.out.println(minimumLength("abaacbcbb"));

    }
    public static int minimumLength(String s) {
      if(s.length()<=2)
          return s.length();
      if(s.length()==3)
          return s.charAt(0)==s.charAt(2)?0:1;
        Map<Character,Integer> freq=new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int compLength=0;
        for (char ch:freq.keySet()){
            if(freq.get(ch)%2==0){
                compLength+=2;
            }
            else {
                compLength+=1;
            }
        }
      return compLength;
    }
}
