package New_batch_leetcode.personal_pro;

public class AddTwoFun {
    static int i=1;
    static  int fun1(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        System.out.println(">> "+i++);
        return fun1(n-1)+fun1(n-2);

    }
    public static void main(String[] args) {
        System.out.println(fun1(6));
    }
}
