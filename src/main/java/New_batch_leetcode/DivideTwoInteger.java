package New_batch_leetcode;

public class DivideTwoInteger {

        public static int divide(int dividend, int divisor) {
                if (dividend==divisor)
                return 1;
              if(dividend<0&&divisor<0){
                  dividend*=-1;
                  divisor*=-1;
              }
            System.out.println(dividend+" "+divisor);
//           if (dividend>=0&&divisor<0)
//               divisor*=-1;
//            System.out.println(divisor);
//           if(dividend<0&&divisor>=0)
//               dividend*=-1;
            int sum=0,count=0;
            while(sum+divisor<=dividend){
                sum+=divisor;
                count++;
            }
            return count;
//            int quotient=-1;
//            int total=0;
//            int i=1;
//            while (total<=dividend){
//                  total=divisor*i++;
//                System.out.println(total);
//                  quotient++;
//            }
//            return quotient;
//            return dividend/divisor;

        }
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }
}
