package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class BitwisXOROfPairin2425 {
    public static void main(String[] args) {
        int[] num1={2,1,3};
        int[] num2={10,2,5,0};
        System.out.println(xorAllNums(num1,num2));

    }
    public  static int xorAllNums(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int res=0;
        if(n%2!=0){
            for(int num : nums2){
                res^=num;
            }
        }
        int m = nums2.length;
        if(m%2!=0){
            for(int num : nums1){
                res^=num;
            }
        }
        return res;

    }
}
