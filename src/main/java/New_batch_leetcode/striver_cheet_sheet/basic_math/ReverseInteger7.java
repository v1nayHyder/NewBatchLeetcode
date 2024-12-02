package New_batch_leetcode.striver_cheet_sheet.basic_math;

public class ReverseInteger7 {
    public static int reverse(int x) {

     int reverse=0;
     while (x!=0) {
         int reminder = x % 10;
         if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && reminder > 7)) {
             return 0;
         }
         if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && reminder < -8)) {
             return 0;
         }
         reverse = reverse * 10 + reminder;
         x = x / 10;

     }

     return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
