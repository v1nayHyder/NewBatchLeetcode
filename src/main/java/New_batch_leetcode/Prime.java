package New_batch_leetcode;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    public static boolean isPrime(int num){

        if(num<=1)
            return  false;
        if(num==2)
            return true;
        if(num%2==0||num%3==0)
            return false;
        for (int i = 5; i*i<=num; i+=6) {
            if(num%i==0||num%(i+1)==0)
                return false;

        }

        return true;
    }
}
