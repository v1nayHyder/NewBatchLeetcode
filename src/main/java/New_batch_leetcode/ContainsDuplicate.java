package New_batch_leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};

     boolean check=containsDuplicate(nums);
        System.out.println(check);

    }
    // bruth force algorithms
    public  static boolean containsDuplicate(int[] nums) {
//
        Arrays.sort(nums);
        for (int j = 0; j <nums.length-1; j++) {
                if (nums[j]==nums[j+1]){
                    return true;
                }

//        for (int i = 0; i <nums.length ; i++) {
//            if (set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);

//            for (int j = i+1; j <nums.length; j++) {
//                if (nums[i]==nums[j]){
//                    return true;
//                }
//            }

        }
        return false;
    }
}
