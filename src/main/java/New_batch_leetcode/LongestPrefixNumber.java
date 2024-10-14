package New_batch_leetcode;

import java.util.Arrays;

public class LongestPrefixNumber {
    public  static int longestCommonPrefix(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        int length=1;
        lable1:
        for (int i = arr1.length-1; i >=0 ; i--) {
            String s1=String.valueOf(arr1[i]);
            for (int j = arr2.length-1; j >=0; j--) {
                String s2=String.valueOf(arr2[j]);
                if(s1.substring(0,s1.length()).equals(s2.substring(0,s1.length()))){
                    System.out.println(arr1[i]);
                    length=s1.length();
                    break lable1;
                }
            }

        }
        return length;

    }

    public static void main(String[] args) {
        int[] str1={1,10,100};
        int[] str2={1000};
        System.out.println(longestCommonPrefix(str1,str2));    }
}
