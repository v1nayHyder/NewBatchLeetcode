package New_batch_leetcode.striver_cheet_sheet.basic_recursion;

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        return checkPalindrome(0,s.length()-1, s);
    }

    private static boolean checkPalindrome(int left, int right, String s) {
        // Base case: If the pointers cross or meet, it is a palindrome
        if (left >= right) {
            return true;
        }
        // Check if characters at current pointers are equal
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        // Recursive call to check the next set of pointers
        return checkPalindrome(left + 1, right - 1, s);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"
        ));
    }
}
