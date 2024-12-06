package New_batch_leetcode.striver_cheet_sheet.shorting_technique1;

import java.util.Arrays;

public class BubbleSortGFG {
    public static void bubbleSort(int arr[]) {
            boolean isSorted;
            for (int i = 0; i <arr.length ; i++) {
                isSorted = true;
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        isSorted=false;
                    }

                }
                if (isSorted) {
                    break;
                }

            }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        bubbleSort(new int[]{1, 3, 9});
    }
}
