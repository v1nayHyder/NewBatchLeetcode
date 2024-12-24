package New_batch_leetcode.daily_challenge;

import java.util.Arrays;
import java.util.Stack;

public class FnlPrsWithSplDis1475 {
    public static void main(String[] args) {
      int result[]=finalPrices(new int[]{8,4,6,2,3});
        System.out.println(Arrays.toString(result));
    }
        public static int[] finalPrices(int[] prices) {
            int n=prices.length;
            int[] result=new int[n];
            Stack<Integer> stack=new Stack<>();
            for (int i = 0; i <n ; i++) {
                while (!stack.isEmpty()&&prices[i]<=prices[stack.peek()]){
                    int index=stack.pop();
                    result[index]=prices[index]-prices[i];
               }
                stack.push(i);
              }
            while (!stack.isEmpty()){
                int index=stack.pop();
                result[index]=prices[index];
            }
            return result;


//    public static int[] finalPrices(int[] prices) {
//     int i=0;
//     int j=1;
//     while (i<prices.length-1){
//         if(j==prices.length){
//             i++;
//             j=i+1;
//         }
//         else if((j>i)&&prices[j]<=prices[i]){
//             prices[i++]-=prices[j];
//             j=i+1;
//         }
//         else {
//             j++;
//         }
//     }
//     return prices;
    }
}
