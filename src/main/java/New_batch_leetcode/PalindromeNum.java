package New_batch_leetcode;

public class PalindromeNum {

    static public boolean isPalindrome(int x) {
        int result=0,temp=x,rem=0;
        while (x>0){
            rem=x%10;
            result=result*10+rem;
            x=x/10;
        }
        if (result==temp){
            return  true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean result=isPalindrome(-121);
        System.out.println(result);
    }
}
