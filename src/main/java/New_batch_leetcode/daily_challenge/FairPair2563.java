package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class FairPair2563 {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long pairs=0;
        for (int i = 0; i <nums.length-1; i++) {
            int j=i+1;
            while (nums[i]+nums[j]<lower){
                j++;
            }
            int start=j;
            while (nums[i]+nums[start]<=upper){
                start++;

            }
            pairs+=start-j;

        }
        return pairs;
    }
        public static void main(String[] args) {
            System.out.println(countFairPairs(new int[]{0,1,7,4,4,5},3,6));
    }
}
