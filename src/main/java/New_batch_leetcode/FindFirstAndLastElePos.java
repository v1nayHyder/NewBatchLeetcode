package New_batch_leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
34. Find First and Last Position of Element in Sorted Array
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */
public class FindFirstAndLastElePos {
    public static int[] searchRange(int[] nums, int target) {
        int start=0;
        int low=-1;
        int end=nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (nums[mid]==target){
                low=mid;
                end=mid-1;
            }
            else if (nums[mid]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        int first=0;
        int last=nums.length-1;
        int high=-1;
        while (first<=last){
            int mid=(first+last)/2;
            if (nums[mid]==target){
                high=mid;
                first=mid+1;
            }
            else if (nums[mid]>target) {
                last=mid-1;
            }
            else {
                first=mid+1;
            }
        }
     return new int[]{low,high};
    }

        // time complexity(n)
//    public static int[] searchRange(int[] nums, int target) {
//        int start=-1;
//        int end=-1;
//        for (int i = 0; i <nums.length ; i++) {
//            if((nums[i]==target) && (start==-1)){
//                start=i;
//            }
//            if((nums[nums.length-1-i]==target) && (end==-1)){
//                end=nums.length-1-i;
//            }
//        }
//
//        return new int[]{start,end};
//    }

    public static void main(String[] args) {
        int target=8;

        int nums[]={5,7,7,8,8,10};
        int result[]=searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
