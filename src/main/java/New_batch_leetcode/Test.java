package New_batch_leetcode;


import java.util.Arrays;

public class Test {
    static void reverse(int num[],int start,int end){
        while (start<end){
            int temp=num[start];
            num[start++]=num[end];
            num[end--]=temp;

        }
    }
    public static int[] rotateArray(int []num,int k) {
        k=k%num.length;
        System.out.println(k);

        reverse(num,0,k-1);
       reverse(num,k,num.length-1);
       reverse(num,0,num.length-1);

        System.out.println(Arrays.toString(num));
   return null;
    }
    public static void main(String[] args) {
         int k=17;
        System.out.println(rotateArray(new int[]{1,2,3,4,5,6,7},k));
    }
}