package New_batch_leetcode.daily_challenge;

public class MakeStrSubSqCyclic2825 {
    public static boolean canMakeSubsequence(String str1, String str2) {
        if(str1.length()<str2.length())
            return false;
        int start=0;
        for (int i = 0; i < str1.length()&&start<str2.length(); i++) {
            char curChar=str1.charAt(i);
            char nextChar= (char) ((str1.charAt(i)-'a'+1)%26+'a');
            if (str2.charAt(start)==curChar||str2.charAt(start)==nextChar){
                start++;
            }
        }
        return start==str2.length();
    }

    public static void main(String[] args) {
        System.out.println(canMakeSubsequence("zc","ad"));
    }
}
