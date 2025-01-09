package New_batch_leetcode.daily_challenge;

import java.io.PrintStream;

public class CountPrefix2185 {
    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"leetcode","et","code"},"et"));
    }
    public static int prefixCount(String[] words, String pref) {

        if (words.length == 0)
            return 0;
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
