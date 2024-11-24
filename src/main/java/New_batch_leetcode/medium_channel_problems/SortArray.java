package New_batch_leetcode.medium_channel_problems;

import java.util.Arrays;

public class SortArray {
    //brute force selection short.

//    public static int[] sortArray(int nums[]){
//        for (int i = 0; i <nums.length-1; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//
//                if(nums[i]>nums[j]){
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
//        return nums;
//    }

//bubble sort

//    public static int[] sortArray(int nums[]){
//        for (int i = 0; i <nums.length; i++) {
//            boolean swapped = false;
//            for (int j = 1; j <nums.length ; j++) {
//                if(nums[j-1]>nums[j]){
//                    int temp=nums[j-1];
//                    nums[j-1]=nums[j];
//                    nums[j]=temp;
//                    swapped = true; // Set flag if a swap is made
//                }
//            }
//            if (!swapped) break;
//        }
//        return nums;
//    }

   //optimal selection sort

//    public static int[] sortArray(int nums[]){
//        for (int i = 0; i <nums.length; i++) {
//            int index=i;
//            for (int j = i+1; j <nums.length ; j++) {
//                if(nums[j]<nums[index]){
//                   index=j;
//                }
//            }
//            int swap=nums[i];
//            nums[i]=nums[index];
//            nums[index]=swap;
//
//
//        }
//        return nums;
//    }

    //quick sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int nums[]={23,5,6,2,78,-1};
//        int result[]=sortArray(nums);
        int low=0;
        int high=nums.length-1;
        quickSort(nums,low,high);
        System.out.println(Arrays.toString(nums));

//        System.out.println(Arrays.toString(result));
    }
}
