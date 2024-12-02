package New_batch_leetcode.striver_cheet_sheet.basic_math;

import java.util.Arrays;

public class LcmAndHcfOrGcdGFG {
    static int[] lcmAndGcd(int a, int b) {
        int hcm=1;

        for (int i = Math.min(a,b) ; i>=1; i--) {
            if(a%i==0&&b%i==0){
                hcm=i;
                break;

            }

        }
        return new int[]{(a/hcm)*b,hcm};
    }
    public static void main(String[] args) {
        int result[]=lcmAndGcd(14,8);
        System.out.println(Arrays.toString(result));
    }
}
