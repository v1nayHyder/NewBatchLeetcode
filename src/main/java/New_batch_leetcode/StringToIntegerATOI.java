package New_batch_leetcode;

public class StringToIntegerATOI {

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int i = 0, sign = 1, n = s.length();
        long result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits to integer and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (result * sign);
    }


    //     static StringBuilder stringBuilder=new StringBuilder();
//    public static int myAtoi(String s) {
//        for (int i = 0; i <s.length() ; i++) {
//            if (s.charAt(i) != ' ' && !Character.isAlphabetic(s.charAt(i))) {
//                if (s.charAt(i) != '0')
//                    stringBuilder.append(s.charAt(i));
//            }
//            else if(Character.isAlphabetic(s.charAt(i))) {
//                break;
//            }
//
//               }
//          int n= Integer.parseInt(String.valueOf(stringBuilder.toString()));
//return n;
//    }
    public static void main(String[] args) {

        String s="1337c0d3";
        System.out.println(myAtoi(s));

    }
}
