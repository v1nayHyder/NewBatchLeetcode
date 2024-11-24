package New_batch_leetcode;

import javax.imageio.stream.ImageInputStream;

public class FancyString {
    public static String makeFancyString(String s) {
        int count = 1;
        StringBuilder fancyString = new StringBuilder(s);
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
                if (count > 2) {
                    count=1;
                    s=s.substring(0,i)+s.substring(i+1);
                    i=1-2;

                }
            }
            else {
                count=1;
            }

        }
        return s;

    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaaa"));
    }
}
