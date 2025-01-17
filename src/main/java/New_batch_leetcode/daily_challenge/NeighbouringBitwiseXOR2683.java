package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class NeighbouringBitwiseXOR2683 {
    public static void main(String[] args) {
        System.out.println(doesValidArrayExist(new int[]{1,1,0}));
    }
    public  static boolean doesValidArrayExist(int[] derived) {
        int result=0;
        for (int i = 0; i <derived.length ; i++) {
             result^=derived[i];

        }
        System.out.println(result);

        return result == 0;

        //brute approach

//     int[] original=new int[derived.length];
//        for (int i = 0; i <derived.length ; i++) {
//            original[i]=derived[i];
//        }
//        int start=0;
//        while (start<derived.length-1){
//                  derived[start]=derived[start]^derived[start+1];
//                  start++;
//
//
//        }
//        if (start==derived.length-1){
//            derived[start]=derived[start]^derived[0];
//        }
//
//        System.out.println(Arrays.toString(original));
//        System.out.println(Arrays.toString(derived));
//        start=0;
//        while (start<derived.length-1){
//            if (start==derived.length-1){
//                derived[start]=derived[start]^derived[0];
//                if(derived[start]!=original[start])
//                    return false;
//            }
//            else {
//                derived[start]=derived[start]^derived[start+1];
//                if(derived[start]!=original[start])
//                    return false;
//                start++;
//            }
//
//        }
//        System.out.println(Arrays.toString(original));
//        System.out.println(Arrays.toString(derived));
//
//        return true;
    }
}
