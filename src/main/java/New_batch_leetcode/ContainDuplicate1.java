package New_batch_leetcode;

import java.util.HashSet;

public class ContainDuplicate1 {
    public  static boolean isDuplicate(int[] nums){
        HashSet set=new  HashSet();
        for (int num:nums) {
            if(set.contains(num))
                return true;
             else
                set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        f  int[] nums={1,2,4,3,};
        boolean result=isDuplicate(nums);
        System.out.println(result);
    }
}
