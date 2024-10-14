package New_batch_leetcode;

import java.util.Arrays;
import java.util.List;

public class PairWithMaxSum {
    public static int pairWithMaxSum(List<Integer> arr) {
      Integer max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.size() ; i++) {
            Integer sum=0;
            for (int j = i; j <arr.size() ; j++) {
                 sum+=arr.get(j);
                System.out.print(sum+"==");
                 max=Math.max(max,sum);
            }

        }
        System.out.println(max+"====");
        return max;
    }
    public static void main(String[] args) {

        System.out.println(pairWithMaxSum(Arrays.asList(4,-3,1,-5,6)));
    }
}
