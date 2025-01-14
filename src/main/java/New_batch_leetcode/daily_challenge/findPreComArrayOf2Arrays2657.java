package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class findPreComArrayOf2Arrays2657 {
    public static void main(String[] args) {
        int[] a={3,1,2,4};
        int [] b={1,3,2,4};
        int[] result=findThePrefixCommonArray(a,b);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
       int[] freq= new int[A.length+1];
       int arrayCount[]=new int[A.length];
       int count=0;
        for (int i = 0; i <A.length; i++) {
            freq[A[i]]++;
            if (freq[A[i]]==2)
                count++;
            freq[B[i]]++;
            if(freq[B[i]]==2)
                count++;
           arrayCount[i]=count;
        }


        return arrayCount;
    }
}
