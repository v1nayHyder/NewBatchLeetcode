package New_batch_leetcode.medium_channel_problems;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        swapNum(num1,num2);

        System.out.println(num1+" "+num2);
    }

    private static void swapNum(int num1, int num2) {
//        int tem=num1;
//        num1=num2;
//        num2=tem;
//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;
//          num1=num1*num2;
//          num2=num1/num2;
//          num1=num1/num2;
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;


        System.out.println(num1+" "+num2);
    }
}
