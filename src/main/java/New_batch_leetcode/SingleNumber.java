package New_batch_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class SingleNumber {
    static public int singleNumber(int[] nums) {
   /*     int single=0;
        for (int num:nums) {
            single^=num;

        }
        return single;*/

        if (nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        HashSet hashSet=new HashSet();
        for (int num:nums){
            if (!hashSet.contains(num)){
                 hashSet.add(num);
            }
            else hashSet.remove(num);

        }

     return (int)hashSet.iterator().next();

    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2,2}));
    }

}