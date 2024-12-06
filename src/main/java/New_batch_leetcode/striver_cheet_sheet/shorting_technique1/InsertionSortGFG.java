package New_batch_leetcode.striver_cheet_sheet.shorting_technique1;

import java.util.Arrays;

public class InsertionSortGFG {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        insertionSort(new int[]{4, 1, 3, 9, 7});
    }
}
