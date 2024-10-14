package New_batch_leetcode;

import java.util.Arrays;

public class RemoveDuplicate {
    static int removeDuplicate(int []nums){
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if (nums[i]!=nums[j])
                nums[i+1]=nums[j];
                i++;
          nums[j]=0;
        }
        System.out.println(Arrays.toString(nums));
        return i+1;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[]{1,1,2,2,3,3}));
    }
}
