package New_batch_leetcode.striver_cheet_sheet.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0]+" "+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
