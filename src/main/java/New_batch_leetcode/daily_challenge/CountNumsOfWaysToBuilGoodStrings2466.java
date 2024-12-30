package New_batch_leetcode.daily_challenge;

public class CountNumsOfWaysToBuilGoodStrings2466 {
    public static void main(String[] args) {
        System.out.println(countGoodStrings(1, 1, 1, 1));
    }
    public static int countGoodStrings(int low, int high, int zero, int one) {
        int maxLen = high + Math.max(zero,one);
        int dp[] = new int[maxLen+1];
        for(int len=high;len>=0;len--){
            int zeroLen = len + zero;
            int oneLen = len + one;
            int zeroCount = (zeroLen >= low && zeroLen <= high)?1:0;
            int oneCount = (oneLen >= low && oneLen <= high)?1:0;
            int res = zeroCount + dp[zeroLen] + oneCount + dp[oneLen];
            dp[len] = res % (1000000007);
        }
        return dp[0];
    }

}

