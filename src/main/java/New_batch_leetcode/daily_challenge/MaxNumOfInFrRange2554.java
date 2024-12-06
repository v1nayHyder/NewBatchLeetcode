package New_batch_leetcode.daily_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MaxNumOfInFrRange2554 {
    public static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        for (int num:banned){
            set.add(num);
        }
        int count=0;
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (set.contains(i))
                continue;
            if (sum+i>maxSum){
                break;
            }
            sum+=i;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(maxCount(new int[]{1,6,5},5,6));
    }
}
