package New_batch_leetcode.daily_challenge;

import java.util.Arrays;
import java.util.HashSet;

public class CountVowelsStrRangs2559 {
    public static void main(String[] args) {
        String[] words={"aba","bcb","ece","aa","e"};
        int queries[][]={{0,2},{1,4},{1,1}};
     int[] result=vowelStrings(words,queries);
        System.out.println(Arrays.toString(result));
    }
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int count = 0;

            for (int j = start; j <= end; j++) {
                int n = words[j].length();
                if (n > 0 && vowels.contains(words[j].charAt(0)) && vowels.contains(words[j].charAt(n - 1))) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;

    }
}
