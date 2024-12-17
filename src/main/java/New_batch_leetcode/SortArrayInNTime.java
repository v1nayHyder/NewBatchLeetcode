package New_batch_leetcode;

import java.util.Arrays;

public class SortArrayInNTime {
    public static void main(String[] args) {
        int[] nums ={2,4,4,2,3,8};
        System.out.println(Arrays.toString(nums));

        int[] sorted=sortNums(nums);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] sortNums(int[] nums) {
        int max=Integer.MIN_VALUE;
        //find the max element in the nums array
        for (int j : nums) {
            max = Math.max(max, j);
        }
        // create new array with max+1 size
        int[] count = new int[max+1];
        //find the frequency of each element in the array
        for(int num:nums){
            count[num]++;
        }
        System.out.println(Arrays.toString(count));
        int index=0;
        //replace the element with nums array
        for (int i = 0; i <count.length ; i++) {
                while (count[i] > 0) {
                    nums[index++] = i;
                    count[i]--;

            }
        }
        System.out.println(Arrays.toString(count));

        return nums;
    }
}
