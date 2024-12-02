package New_batch_leetcode.striver_cheet_sheet.basic_recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[],int left) {

        System.out.println(Arrays.toString(arr));
         if(left>=arr.length/2){
             System.out.println(Arrays.toString(arr));
             return;
         }
         int temp=arr[left];
         arr[left]=arr[arr.length-1-left];
        arr[arr.length-1-left]=temp;
         reverseArray(arr,left+1);

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        reverseArray(arr,0);
    }
}
