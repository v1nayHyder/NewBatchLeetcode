package New_batch_leetcode;

class Solution3 {
    public  static String shortestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return s;
        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        int[] lps = computeLPSArray(temp);
        int longestPalindromicPrefixLength = lps[temp.length() - 1];
        String suffixToAdd = s.substring(longestPalindromicPrefixLength);
        StringBuilder result = new StringBuilder(suffixToAdd).reverse().append(s);
        return result.toString() ;

    }
    private static int[] computeLPSArray(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int length = 0; // length of the previous longest prefix suffix
        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }

        }

        return lps;
    }

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("abcd"));    }
}

