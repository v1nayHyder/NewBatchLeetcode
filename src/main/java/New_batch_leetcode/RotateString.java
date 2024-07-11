package New_batch_leetcode;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String mergeString = s + s;
        return mergeString.contains(goal);
    }

    public static void main(String[] args) {
            String str1="abcde";
            String str2="cdeab";
            System.out.println(rotateString(str1,str2));
        }
}
