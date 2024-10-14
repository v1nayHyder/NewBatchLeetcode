package New_batch_leetcode;

public class LargestOddNum {

    public static String largestOddNumber(String num) {
        // Iterate from the end of the string to the beginning

        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd digit
            if ((num.charAt(i) - '0') % 2 != 0) {
                System.out.println(num.charAt(i)-'0');
                // Return the substring from the start to the current index
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
//    public static String largestOddNumber(String num) {
//        int res = Integer.parseInt(num);
//        int max=Integer.MIN_VALUE;
//        boolean check=false;
//        if (res % 2 != 0)
//            return num;
//        else {
//            while (res>0){
//                int rem=res%10;
//                if (rem%2!=0){
//                    max=Math.max(max,rem);
//                    check=true;
//                }
//                res=res/10;
//                if(res%2!=0){
//                    return new String(String.valueOf(res));
//                }
//            }
//
//        }
//         if (check)
//             return   new String(String.valueOf(max));
//         return num;
//    }
    public static void main(String[] args) {
       String s="52";
        System.out.println(largestOddNumber(s));
    }
}
