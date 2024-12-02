package New_batch_leetcode.striver_cheet_sheet.basic_math;

public class SumOfDivFrom1ToNGFG {
    public static int sumOfDivisors(int n) {
        int numSum[]=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                numSum[j]+=i;
            }
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=numSum[i];
        }
        return sum;
    }
//        int sum=0;
//        for (int i = 1; i <=n; i++) {
//            int j=1;
//            while (i>=j){
//                if(i%j==0){
//                    sum+=j;
//                }
//                j++;
//            }
//
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(5));
    }
}
