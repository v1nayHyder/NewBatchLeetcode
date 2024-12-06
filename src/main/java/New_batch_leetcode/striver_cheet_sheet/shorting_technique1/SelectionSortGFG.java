package New_batch_leetcode.striver_cheet_sheet.shorting_technique1;

import java.util.Arrays;

public class SelectionSortGFG {

   static int[] selectionSort(int[] arr) {

       for (int i = 0; i <arr.length-1 ; i++) {
           int min=i;
           for (int j = i+1; j <arr.length ; j++) {
               if(arr[min]>arr[j])
                   min=j;
               }
              int tem=arr[i];
               arr[i]=arr[min];
               arr[min]=tem;
           }


       return arr;


//       for (int i = 0; i <arr.length-1 ; i++) {
//           for (int j = i+1; j <arr.length ; j++) {
//               int temp=arr[i];
//               if(arr[i]>arr[j]){
//                   arr[i]=arr[j];
//                   arr[j]=temp;
//
//               }
//           }
//
//       }
//       return arr;
    }
    public static void main(String[] args) {
        int result[]=selectionSort(new int[]{1, 3, 9, 7});
        System.out.println(Arrays.toString(result));
    }
}
