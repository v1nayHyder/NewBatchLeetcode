package New_batch_leetcode;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String word1,String word2) {
        if (word1.length() != word2.length())
             return false;
        HashMap<Character,Integer> set=new HashMap();
        for (char ch1:word1.toCharArray()) {
            set.put(ch1,set.getOrDefault(ch1,0)+1);
        }
        for (char ch:word2.toCharArray()) {
         int fre=set.getOrDefault(ch,0);
            System.out.println(fre);
           if (fre==0){
               return false;
           }
           set.put(ch,fre-1);
        }
        System.out.println(set);
     return true;

    }

    public static void main(String[] args) {
        String str1="aacc";
        String str2="ccaa";
        System.out.println(isAnagram(str1,str2));
    }

}
