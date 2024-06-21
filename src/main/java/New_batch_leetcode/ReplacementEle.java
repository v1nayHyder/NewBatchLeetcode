package New_batch_leetcode;

import java.util.Arrays;

/*
1299. Replace Elements with Greatest Element on Right Side
Easy
Topics
Companies
Hint
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.



Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
Example 2:

Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.


Constraints:

1 <= arr.length <= 104
1 <= arr[i] <= 105
 */
public class ReplacementEle {

    public static int[] replaceElements(int[] arr) {
       int max=-1;
       int val=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(max<arr[i]){
                val=arr[i];
                arr[i]=max;
                System.out.print(arr[i]+" ");
                max=val;
            }
            else if (max!=arr[i]&&max>arr[i]){
                arr[i]=max;
            }

        }
        return arr;
    }

//    public static int[] replaceElements(int[] arr) {
//        int arr2[]=new int[arr.length];
//        for (int i = 0; i <arr.length ; i++) {
//            boolean flag=true;
//            for (int j = i+1; j <arr.length; j++) {
//                if ((arr[i])<(arr[j]))
//                {
//                    flag=false;
//                    break;
//                }
//
//
//            }
//            if (flag) {
//                System.out.println(arr[i]);
//            }
//
//
//        }
//     return arr2;
//    }
    public static void main(String[] args) {
        int arr[]=replaceElements(new int[]{144});
        System.out.println(Arrays.toString(arr));

    }
}
