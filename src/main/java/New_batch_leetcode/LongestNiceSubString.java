package New_batch_leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubString {

    public static String longestNiceSubstring(String s) {
        String longestNiceSubstr = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (isNice(substr) && substr.length() > longestNiceSubstr.length()) {
                    longestNiceSubstr = substr;
                }
            }
        }

        return longestNiceSubstr;
    }

    private static boolean isNice(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            if (set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))) {
                continue;
            }
            return false;
        }
        return true;
    }


//    public static String longestNiceSubstring(String s) {
//        if (s.length() < 2) return "";
//        Set<Character> set = new HashSet<>();
//        for (char c : s.toCharArray()) {
//            set.add(c);
//        }
//        System.out.println(set);
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) {
//                continue;
//            }
//            String left = longestNiceSubstring(s.substring(0, i));
//            String right = longestNiceSubstring(s.substring(i + 1));
//            return left.length() >= right.length() ? left : right;
//        }
//
//        return s;
//    }

    public static void main(String[] args) {
        String s = "YazaAay";
        System.out.println(longestNiceSubstring(s));
    }

}
