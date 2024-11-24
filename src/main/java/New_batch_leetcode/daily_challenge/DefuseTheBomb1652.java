package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class DefuseTheBomb1652{
    public static int[] decrypt(int[] code, int k) {
       int length=code.length;
       int decrypt[]=new int[code.length];
       if(k>0){
           for (int i = 0; i < length; i++) {
               int sum=0;
               for (int j = 1; j <=k ; j++) {
                    sum+=code[(i+j)%length];
               }
               decrypt[i]=sum;

           }
       } else if (k<0) {
           for (int i = 0; i < length; i++) {
               int sum=0;
               for (int j = 1; j <= -k; j++) {
                   sum += code[(i - j + length) % length]; // Circular indexing
               }
               decrypt[i] = sum;

           }
       }
       else {
           Arrays.fill(code,0);
           return code;
       }
        return decrypt;

    }
    public static void main(String[] args) {
        int code[]={5,7,1,4};
        int k=3;
        int decryptCode[]=decrypt(code,k);
        System.out.println(Arrays.toString(decryptCode));
    }
}
