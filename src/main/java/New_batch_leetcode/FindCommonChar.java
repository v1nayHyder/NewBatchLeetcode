package New_batch_leetcode;

import java.util.ArrayList;
import java.util.List;

/*
1002. Find Common Characters
Easy
Topics
Companies
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.



Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]


Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.
 */
public class FindCommonChar {

//    public static List<String> commonChars(String[] words) {
//    return List[null];
//    }

//    public static List<String> commonChars(String[] words) {
//        List<String> strings=new ArrayList<>();
//        for (int i=0;i<words[0].length();i++) {
//            boolean check = false;
//            for (int j = 1; j < words.length; j++) {
//                check = false;
//                label1:
//                for (int k = 0; k < words[0].length(); k++) {
//                    if (words[0].charAt(i) == words[j].charAt(k)) {
//                        check = true;
//                        break label1;
//                    }
//                }
//
//            }
//            if (check){
//                System.out.println(words[0].charAt(i));
//                if (!strings.contains(Character.toString(words[0].charAt(i)))) {
//                    strings.add(Character.toString(words[0].charAt(i)));
//                }
//        }// Add the common character to the list
//
//        }
//      return  strings;
//
//    }
    public static void main(String[] args) {
     String words[]={"cool","lock","cook"};
//        System.out.println(commonChars(words));
    }
}
