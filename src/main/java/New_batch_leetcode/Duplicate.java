package New_batch_leetcode;

import java.util.*;

public class Duplicate {
    public static int removeDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if (!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        for (int i = 1; i <=nums.length ; i++) {
            if (i<=list.size()){
                nums[i]=list.indexOf(i);
            }
            else {
                nums[i]=0;
            }

        }
        System.out.println(Arrays.toString(nums));
       return list.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
    }
