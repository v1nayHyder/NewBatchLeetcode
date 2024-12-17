package New_batch_leetcode;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergeNums[]=new int[m+n];
        int mergeIndex=0;
        int index1=0;
        int index2=0;
        while(index1<m&&index2<n){
            if(nums1[index1]>nums2[index2]){
                mergeNums[mergeIndex++]=nums2[index2++];
            }
            else{
                mergeNums[mergeIndex++]=nums1[index1++];
            }
        }
        while(index1<m){
            mergeNums[mergeIndex++]=nums1[index1++];
        }
        while(index2<n){
            mergeNums[mergeIndex++]=nums2[index2++];
        }
        System.out.print(Arrays.toString(mergeNums));
    }

    public static void main(String[] args) {
       merge(new int[]{1,2,3,45,66,70},6,new int[]{2,5,6},3);
    }
}
