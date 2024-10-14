package New_batch_leetcode;
/* 704. Binary Search
        Solved
        Easy
        Topics
        Companies
        Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

        You must write an algorithm with O(log n) runtime complexity.



        Example 1:

        Input: nums = [-1,0,3,5,9,12], target = 9
        Output: 4
        Explanation: 9 exists in nums and its index is 4
        Example 2:

        Input: nums = [-1,0,3,5,9,12], target = 2
        Output: -1
        Explanation: 2 does not exist in nums so return -1


        Constraints:

        1 <= nums.length <= 104
        -104 < nums[i], target < 104
        All the integers in nums are unique.
        nums is sorted in ascending order.

 */
public class BinarySearch {
    //total time complexity=(olog n)
        public static int search(int[] nums, int target) {
            int start=0;
            int end=nums.length-1;
            while (start<=end){
                int mid=(start+end)/2;
                if (target==nums[mid]){
                    return mid;
                }
                else if (target>nums[mid]) {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }

            return -1;
        }

//        public static int search(int[] nums, int target) {
//
//            for (int i = 0; i <nums.length ; i++) {
//                if (nums[i]==target)
//                    return i;
//
//            }
//            return -1;
//        }
//    public static int search(int[] nums, int target) {
//        if (nums.length==1&& nums[0]==target)
//            return 0;
//        int i=0;
//        while (i<=nums.length/2&&nums.length>1){
//            if(nums[i]==target){
//                return i;
//            }
//            else if(nums[nums.length-1-i]==target){
//                return nums.length-1-i;
//            }
//            else if(nums[(nums.length+1)/2]==target)
//                return i+1;
//            i++;
//        }
//
//        return -1;
//    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5},-5));
    }

}
