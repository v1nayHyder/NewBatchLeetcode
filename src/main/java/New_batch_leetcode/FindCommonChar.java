package New_batch_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
    public static List<String> commonChars(String[] words) {
        // Initialize the minimum frequency array with a large number
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        // Iterate over each word
        for (String word : words) {
            // Frequency array for the current word
            int[] charFreq = new int[26];
            for (char c : word.toCharArray()) {
                charFreq[c - 'a']++;
            }
            System.out.println(Arrays.toString(charFreq));

            // Update the minimum frequency array
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
            System.out.println(Arrays.toString(minFreq));
        }

        // Build the result list
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }


    // optimal approach

//    public static List<String> commonChars(String[] words) {
//        List<String> list=new ArrayList<>();
//        String start=words[0];
//        for (int i = 0; i <start.length() ; i++) {
//            int flag=0;
//            label2:
//            for (int j = 1; j < words.length; j++) {
//                flag=0;
//                char ch1[]=words[j].toCharArray();
//                for (int k = 0; k <ch1.length ; k++) {
//                    if (ch1[k]==start.charAt(i)&&ch1[k]!='0'){
//                        flag=1;
//                        ch1[k]='0';
//                        words[j]=new String(ch1);
//                        System.out.println(words[j]);
//                        break;
//                    }
//                    else if (k==ch1.length-1 && flag==0) {
//                        break label2;
//
//                    }
//                }
//            }
//
//            System.out.println("+++++++");
//            if (flag==1) {
//                list.add(String.valueOf(start.charAt(i)));
//            }
//        }
//        return  list;
//    }
    public static void main(String[] args) {
     String words[]={"cool","lock","cook"};
        System.out.println(commonChars(words));
    }
}
