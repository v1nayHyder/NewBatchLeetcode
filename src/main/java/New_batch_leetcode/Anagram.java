package New_batch_leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        /* bruth force approach to resolve it*/

// Overall time complexity: O(n log n)
// Overall space complexity: O(n)
        char[] chars1 = s.toCharArray();  // O(n) time, O(n) space
        char[] chars2 = t.toCharArray();  // O(n) time, O(n) space
        Arrays.sort(chars1);              // O(n log n) time, O(1) extra space (in-place sort)
        Arrays.sort(chars2);              // O(n log n) time, O(1) extra space (in-place sort)
        System.out.println();             // O(1) time
        if (new String(chars1).equals(new String(chars2))){  // O(n) time, O(n) space for new strings
            return true;                  // O(1) time
        }

            /* this one best case approach*/
// Overall time complexity: O(n)
// Overall space complexity: O(n)
        HashMap<Character,Integer> map=new HashMap();  // O(1) time, O(1) space
        for(char ch1:s.toCharArray()){                // O(n) time
            map.put(ch1,map.getOrDefault(ch1,0)+1);   // O(1) time
        }
        for(char ch2:t.toCharArray()){                // O(n) time
            int fre=map.getOrDefault(ch2,0);          // O(1) time
            if(fre==0) {                               // O(1) time
                return false;                          // O(1) time
            }
            map.put(ch2,fre-1);                        // O(1) time
        }

        return false;
    }
    public static void main(String[] args) {
        String str1="anagarm";
        String str2="nagaram";
        System.out.println(isAnagram(str1,str2));
    }
}
