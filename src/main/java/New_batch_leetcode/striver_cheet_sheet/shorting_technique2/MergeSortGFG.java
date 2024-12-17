package New_batch_leetcode.striver_cheet_sheet.shorting_technique2;


public class MergeSortGFG {

    public static void merge(int nums[], int start, int mid, int end) {
        int n1 = mid - start + 1; // Size of the left subarray
        int n2 = end - mid;       // Size of the right subarray

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = nums[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = nums[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0; // Initial indices of the left and right subarrays
        int k = start;    // Initial index of the merged subarray

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[], if any
        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[], if any
        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }

    public  static void sort(int[] nums,int start,int end){

            if(start>=end)
             return;
            int mid=start+(end-start)/2;

            System.out.print(mid+" ");
            sort(nums,start,mid);
            sort(nums,mid+1,end);
            merge(nums, start, mid, end);



    }
    public static void main(String[] args) {
        sort(new  int[]{27,10,43,38,51},0,4);

    }
}
