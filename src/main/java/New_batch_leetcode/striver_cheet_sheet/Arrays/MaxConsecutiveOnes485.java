package New_batch_leetcode.striver_cheet_sheet.Arrays;

public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
    int count=0;
    int max=Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }

        }
        max=Math.max(max,count);
        return max ;
    }

}
