package New_batch_leetcode;
/*
31. Next Permutation
Solved
Medium
Topics
Companies
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int i = nums.length - 2;
        // Step 1: Find the largest index `i` such that `nums[i] < nums[i + 1]`
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) { // If such index exists
            int j = nums.length - 1;
            // Step 2: Find the largest index `j` greater than `i` such that `nums[i] < nums[j]`
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap the values of `nums[i]` and `nums[j]`
            swap(nums, i, j);
        }
        // Step 4: Reverse the sequence from `nums[i + 1]` to the end of the array
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
         NextPermutation sol = new NextPermutation();
        int[] nums = {1, 2, 3};
        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        sol.nextPermutation(nums);
        System.out.println("Next permutation: " + java.util.Arrays.toString(nums));
    }
}
