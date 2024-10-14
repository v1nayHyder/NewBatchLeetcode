package New_batch_leetcode;

import java.util.*;

class lexicographicalNumber {
    static int dp[] = new int[50];

    public static int minExtraChar(String s, String[] dictionary) {
        Arrays.fill(dp, -1);
        HashSet<String> set = new HashSet<>(Arrays.asList(dictionary));
        return recurse(s, set, 0);
    }

    public static int recurse(String s, HashSet<String> set, int index) {
        if (index == s.length()) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        StringBuilder stringBuilder = new StringBuilder();
        int minExtraChar = Integer.MAX_VALUE;
        for (int i = index; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            int extraChar = 0;
            if (!set.contains(stringBuilder.toString())) {
                extraChar = stringBuilder.length();
            }
            int curExtraChar = recurse(s, set, i + 1);
            minExtraChar = Math.min(minExtraChar, extraChar + curExtraChar);
        }
        dp[index] = minExtraChar;
        return dp[index];
    }

    public static void main(String[] args) {
        System.out.println(minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"}));
    }
}
