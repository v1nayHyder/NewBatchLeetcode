package New_batch_leetcode;

public class ClimbStairs {
    public  static int  ClimbStairs(int n){
        int count=1;
        for (int i = 1; i <n ; i++) {
        if (n%2==0){
            count++;
        }
        }
       return count;
    }

    public static void main(String[] args) {
        int num=3;

        System.out.println(ClimbStairs(num));
    }

}
