package New_batch_leetcode.daily_challenge;

public class PreAndSufPairs3042 {
    public static void main(String[] args) {
        String[] words = {"leetcode","et","code"};
        System.out.println(countPrefixSuffixPairs(words));

    }
    public static int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                String str1 = words[i];
                String str2 = words[j];
                if (str1.length() > str2.length()) continue;
                if (str2.startsWith(str1) && str2.endsWith(str1)) {
                    ++count;
                }
            }
        }
        return count;
    }
}
