package New_batch_leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        int nums[]={1,2,3,1,4,3,1,1};
        Set set=new HashSet<>();
        for (int num:nums) {
            if(!set.contains(num))
                set.add(num);
            else {
                System.out.print(num+" ");
            }

        }
        System.out.println();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]){
                nums[i+1]=0;
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println(3+5);
//        System.out.println(set);
    }
}
