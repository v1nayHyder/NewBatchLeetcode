package New_batch_leetcode.daily_challenge;

import java.util.Arrays;
import java.util.List;

public class findScoreOfMarkingEle2593 {
    public static long findScore(int[] nums) {
        int n=nums.length;
      int[][] indexedEle =new int[n][2];
        for (int i = 0; i <n ; i++) {
            indexedEle[i][0]=nums[i];
            indexedEle[i][1]=i;
        }
        Arrays.sort(indexedEle, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(indexedEle));
        int result=0;
        for (int i = 0; i <n ; i++) {
            int ele=indexedEle[i][0];
            int index=indexedEle[i][1];
            if (nums[index]<0)
                continue;
            result+=ele;
            nums[index]=-nums[index];
            if (index-1>=0&& nums[index-1]>0){
                nums[index-1]=-nums[index-1];
            }
            if (index+1<n&&nums[index+1]>0){
                nums[index+1]=-nums[index+1];
            }

        }
        return result;
    }
        public static void main(String[] args) {
            System.out.println(findScore(new int[]{2,1,3,4,5,2}));
    }
}
