package New_batch_leetcode.daily_challenge;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueLen3PalindromicSubsequence1930 {
    public static void main(String[] args) {
      int result=countPalindromicSubsequence("aabca");
        System.out.println(result);
    }
    public static int countPalindromicSubsequence(String s) {
        if(s.length() < 3){
            return 0;
        }
        int n=s.length();
        HashMap<Character,Integer> firstOccurrence=new HashMap<>();
        HashMap<Character,Integer> secondOccurrence=new HashMap<>();
        for (int i = 0; i <n ; i++) {

            if(!firstOccurrence.containsKey(s.charAt(i))){
                firstOccurrence.put(s.charAt(i),i);
            }
            secondOccurrence.put(s.charAt(i),i);
        }
        int count=0;
        for (char ch:firstOccurrence.keySet()){
            int start=firstOccurrence.get(ch);
            int end=secondOccurrence.get(ch);
            HashSet<Character> set=new HashSet<>();
            for(int i=start+1;i<end;i++){
                set.add(s.charAt(i));
            }
            count+=set.size();
        }
    return count;
    }
}
