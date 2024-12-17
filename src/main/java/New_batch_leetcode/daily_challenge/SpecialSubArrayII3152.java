package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class SpecialSubArrayII3152 {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int trackEvenOdd[]=new  int[nums.length];
        trackEvenOdd[0]=1;
        for(int start=1;start<nums.length;start++){
            if((nums[start]&1)==(nums[start-1]&1)){
                trackEvenOdd[start]=1;
            }
            else {
                trackEvenOdd[start]=1+trackEvenOdd[start-1];
            }
            System.out.println(Arrays.toString(trackEvenOdd));
        }
        boolean answer[]=new boolean[queries.length];
        int count=0;
         for (int val[]:queries){
             int start=val[0];
             int end=val[1];
             int size=end-start+1;
             if (trackEvenOdd[end]>=size)
                 answer[count++]=true;
             else
                 answer[count++]=false;
         }
        return answer;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(isArraySpecial(new int[]{3,4,1,2,6},new int[][]{{0,4}})));
    }
}
