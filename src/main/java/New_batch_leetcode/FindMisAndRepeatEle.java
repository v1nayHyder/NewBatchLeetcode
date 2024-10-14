package New_batch_leetcode;

import java.util.*;

public class FindMisAndRepeatEle {
     static  int[] findTwoElement(int arr[]) {
       int nums[]=new int[2];
       Arrays.sort(arr);
       int n=arr.length;
       int missing=1;
       int count=1;

         for (int i = 0; i <n ; i++) {
             if (arr[i]!=missing)
                 nums[count--]=missing;

             missing++;
                 for (int j = 1; j < n; j++) {

                     if (arr[i]==arr[j]){
                         nums[count--]=arr[i];
                     }
                     if(count==-1)
                         return nums;

                 }

         }
         return new int[]{-1,-1};

     }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwoElement(new int[]{2,2})));
    }
}
