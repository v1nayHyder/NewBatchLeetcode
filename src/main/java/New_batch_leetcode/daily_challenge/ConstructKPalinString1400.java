package New_batch_leetcode.daily_challenge;

import java.util.HashMap;
import java.util.Map;

public class ConstructKPalinString1400 {
    public static void main(String[] args) {
        System.out.println(canConstruct("true",4));
    }
    public static boolean canConstruct(String s, int k) {
        if (s.length()<k)
            return  false;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char key:map.keySet()){
            if(map.get(key)%2!=0){
                count++;
            }
        }

        return k>=count;

//        if (s.length()<k||s.isEmpty())
//             return false;
//        if(s.length()==k)
//            return true;
//        int previous=0;
//        int count=0;
//        int next=previous+1;
//        while (next<s.length()-2){
//              if (s.charAt(previous)==s.charAt(next)){
//                  String subString=s.substring(previous,next+1);
//                  StringBuilder stringBuilder=new StringBuilder(subString).reverse();
//                  if(subString.contentEquals(stringBuilder)){
//                      count++;
//                  }
//              }
//              else {
//                  next++;
//              }
//              if(count==k)
//                  return true;
//        }
//
//
//
//        return false;
    }
}
