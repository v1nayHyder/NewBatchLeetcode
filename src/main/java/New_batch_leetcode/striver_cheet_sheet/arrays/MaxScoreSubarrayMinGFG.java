package New_batch_leetcode.striver_cheet_sheet.arrays;

public class MaxScoreSubarrayMinGFG {
    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{4, 3, 1, 5, 6}));
    }
    private static int maxScore(int[] arr) {
        if (arr.length < 2) return 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int maxScore=0;
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest) {
                secondSmallest = num;
            }
            if (smallest != Integer.MAX_VALUE && secondSmallest != Integer.MAX_VALUE)
            {
                maxScore = Math.max(maxScore, smallest + secondSmallest);
            }

        }
        return maxScore;
    }
}
