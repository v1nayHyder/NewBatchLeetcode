package New_batch_leetcode.striver_cheet_sheet.basic_recursion;

public class FactorialGFG {
    public static void main(String[] args) {
        int fact=factorial(5);
        System.out.println(fact);
    }

    private static int factorial(int i) {
        if (i==0)
            return 1;
        return i*factorial(i-1);
    }
}
