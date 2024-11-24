package New_batch_leetcode;

public class BitwiseAnd2275 {
    public static int largestCombination(int[] candidates) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<24;i++){
            int countCombination=0;
            for( int candidate:candidates){
                if ((candidate & (1 << i)) != 0) {
                    countCombination++;
                }
            }
            max=Math.max(max,countCombination);
        }

        return max;

    }

    public static void main(String[] args) {
        int nums[]={16,17,71,62,12,24,14};
        System.out.println(largestCombination(nums));
    }
}
