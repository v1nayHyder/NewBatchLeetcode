package New_batch_leetcode.striver_cheet_sheet.basic_math;

public class PalindromeNumber9 {
    public static boolean isPalindrome(int x) {
        int palindrome=0;
        int num=x;
        while (num>0){
            int remainder=num%10;
            palindrome=palindrome*10+remainder;
            num=num/10;
        }

return palindrome==x;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
