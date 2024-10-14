package New_batch_leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubSetII {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mainList=new ArrayList<>();
        List<Integer> childList=null;
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("__"+i);
             childList=new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                childList.add(nums[j]);
            }
            if (i==nums.length-1&& count<nums.length-1){
                i=++count;
                System.out.println(count);
            }
            mainList.add(childList);
//            System.out.println(childList);
            System.out.println(mainList);

        }

        return mainList;
    }

    public static void main(String[] args) {
        List<List<Integer>> list=subsetsWithDup(new int[]{1,2,2});
        System.out.println(list);
    }
}
