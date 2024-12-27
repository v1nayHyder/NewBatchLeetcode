package New_batch_leetcode.daily_challenge;

public class BestSightseeingPair1014 {
    public static void main(String[] args) {
     int result=maxScoreSightseeingPair(new int[]{8,1,5,2,6});
        System.out.println(result);
    }
    public static int maxScoreSightseeingPair(int[] values) {

        int maxScore=0;
        int minvlaue= values[0];
        for(int i=1;i<values.length;i++){
            int value=values[i]-i;
            maxScore=Math.max(maxScore,minvlaue+value);
            minvlaue=Math.max(minvlaue,values[i]+i);
        }
        return maxScore;

//        int maxScore=0;
//        int n=values.length;
//        for (int i=0;i<n-1;i++){
//            for (int j = i+1; j < n; j++) {
//                int value=values[i]+values[j]+i-j;
//                maxScore=Math.max(maxScore,value);
//
//            }
//        }
//        return maxScore;
    }
}
