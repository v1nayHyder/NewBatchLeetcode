package New_batch_leetcode;

public class StringPermutation {
    public  static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (int i = 0; i < n; i++) {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;  // Also fill the first window of s2
        }
        for (int i = n; i < m; i++) {

            if (matches(map1, map2)) {
                return true;
            }
            map2[s2.charAt(i - n) - 'a']--;
            map2[s2.charAt(i) - 'a']++;
        }
        return matches(map1, map2);
    }
    private static boolean matches(int[] map1, int[] map2) {
        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
}
