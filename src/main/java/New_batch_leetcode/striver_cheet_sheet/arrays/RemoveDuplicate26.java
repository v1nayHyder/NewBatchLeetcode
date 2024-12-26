package New_batch_leetcode.striver_cheet_sheet.arrays;

public class RemoveDuplicate26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public static int removeDuplicates(int[] nums) {
        int count=1;
        for (int i = 1; i <nums.length; i++) {
            if (nums[i-1]!=nums[i]){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
