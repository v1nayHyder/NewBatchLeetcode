package New_batch_leetcode;

public class MinimumLengthString {

    public static int minLength(String s) {
        String subString1 = "AB";
        String subString2 = "CD";

        while (s.contains(subString1) || s.contains(subString2)) {
            s = s.replace(subString1, "");
            s = s.replace(subString2, "");
            System.out.println(s);
        }

        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));  // Example input
    }
}
