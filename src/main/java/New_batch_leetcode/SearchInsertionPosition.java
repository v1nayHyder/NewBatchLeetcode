package New_batch_leetcode;

public class SearchInsertionPosition {
    public static int searchInsert(int[] nums, int target) {
//        System.out.println((float)(0+3)/2);
        for (int i = 0; i <nums.length-1 ; i++) {
            if (target > nums[i] && target < nums[i + 1])
                return i + 1;
            else if (target == nums[i])
                return i;

        }
        if (target>nums[nums.length-1])
            return nums.length;
        if (target==nums[nums.length-1])
            return nums.length-1;

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3},3));
    }
}
