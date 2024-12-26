package New_batch_leetcode.striver_cheet_sheet.arrays;

public class BstTmsBuyAndSellStock121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int n=prices.length;
        int start=0;
        int end=1;
        while(end<n){
            if(prices[start]>prices[end]){
                start=end;
            }
            else {
                maxProfit=Math.max(prices[end]-prices[start],maxProfit);
            }
            end++;

        }
        return maxProfit;

//     int maxProfit=0;
//        for (int i = 0; i <prices.length-1 ; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
//                System.out.println(maxProfit);
//            }
//        }
//        return maxProfit;
    }

}
