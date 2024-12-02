package New_batch_leetcode.striver_cheet_sheet.basic_math;

public class CheckPrimeGFG {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n<=3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 2; i*i <=n ; i+=6) {

            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

//    static boolean isPrime(int n) {
//        for (int i = 2; i <n ; i*=i) {
//            if(n%i==0)
//                return false;
//        }
//        return true;
//    }
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
}
