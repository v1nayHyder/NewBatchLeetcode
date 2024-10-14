package New_batch_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int target=9;
        int[] result= twoSum(new int[]{2,11,15,7},target);

        System.out.println(Arrays.toString(result));
    }
    public  static int[] twoSum(int nums[], int target){
        HashMap<Integer,Integer> hashSet=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if (hashSet.containsKey(complement)) {
                System.out.println(hashSet);
                return new int[]{hashSet.get(complement), i};
            }
            hashSet.put(nums[i],i);

        }





//        for (int i = 0; i <nums.length ; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//                if (nums[i]+nums[j]==target)
//                    return new int[]{i,j};
//
//            }
//
//        }

        return null;
    }
}
