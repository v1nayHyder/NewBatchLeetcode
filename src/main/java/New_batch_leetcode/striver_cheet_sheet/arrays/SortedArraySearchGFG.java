package New_batch_leetcode.striver_cheet_sheet.arrays;

public class SortedArraySearchGFG {
    public static void main(String[] args) {
        System.out.println(searchInSorted(new int[]{1, 2, 3, 4, 6},90));
    }
    static boolean searchInSorted(int arr[], int k) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int  mid=start+(end-start)/2;
            if (arr[mid]==k){
                return true;
            }
            else if (arr[mid]>k){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return false;
    }
}