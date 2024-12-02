package New_batch_leetcode.striver_cheet_sheet.basic_recursion;

public class SumOfOneToN {
    static int sumRecurse(int n,int sum)
    {
        if (n==0){
//            System.out.println(sum);
            return sum;
        }
        else {
            sum += (int) Math.pow(n, 3);
            sum = sumRecurse(n - 1, sum);
        }
    return sum;
    }    public static void main(String[] args) {
        System.out.println(sumRecurse(5,0));
    }
}
