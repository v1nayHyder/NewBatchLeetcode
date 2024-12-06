package New_batch_leetcode.personal_pro;

public class FabonacciRecurse {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int i) {
        if (i==0)
            return 0;
        if (i==1)
            return 1;
      return   fact(i-1)+fact(i-2);
    }
}
