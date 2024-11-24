package New_batch_leetcode;

import java.util.ArrayList;

public class CountNumberPairs {


        // Merge function that also counts the inversions
        private static int merge(int[] arr, int low, int mid, int high) {
            ArrayList<Integer> temp = new ArrayList<>(); // temporary array
            int left = low;      // starting index of left half of arr
            int right = mid + 1;   // starting index of right half of arr
            int cnt = 0;  // Count of inversions

            // Storing elements in the temporary array in a sorted manner
            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left]);
                    left++;
                } else {
                    temp.add(arr[right]);
                    cnt += (mid - left + 1); // Count inversions
                    right++;
                }
            }

            // If elements on the left half are still left
            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }

            // If elements on the right half are still left
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }

            // Transferring all elements from temp back to arr
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
            return cnt; // Return the count of inversions
        }

        // Merge Sort function that returns the count of inversions
        public static int mergeSort(int[] arr, int low, int high) {
            int cnt = 0;
            if (low >= high) return cnt;
            int mid = (low + high) / 2;

            cnt += mergeSort(arr, low, mid);  // left half
            cnt += mergeSort(arr, mid + 1, high); // right half
            cnt += merge(arr, low, mid, high);  // merging sorted halves
            return cnt;
        }

        // Function to count the number of inversions
        public static int inversionCount(int arr[]) {
            return mergeSort(arr, 0, arr.length - 1);  // Pass arr.length - 1 as the high index
        }


//    static int inversionCount(int arr[]) {
//        int count=0;
//        for (int i = 0; i <arr.length-1; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[i]>arr[j])
//                    count++;
//
//            }
//
//        }
//        return count;
//    }

        public static void main(String[] args) {
            System.out.println(inversionCount(new int[]{2, 3, 4, 5, 6,}));
        }

}
