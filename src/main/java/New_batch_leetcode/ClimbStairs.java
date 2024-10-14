package New_batch_leetcode;
/*70. Climbing Stairs

        You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step

        Constraints:
        1 <= n <= 45 */

/* Use the Fibonacci approach to solve the Climbing stairs using 1 or 2 steps to reach the nth step of the destination */

public class ClimbStairs {
    public  static int  ClimbStairs(int n){
        if (n<=2)
            return n;
      int count1=1,count2=1;
      int result=0;
        for (int i = 0; i <n ; i++) {
            result=result+count1;
            count1=count2;
            count2=result;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=2;

        System.out.println(ClimbStairs(num));
    }

}
