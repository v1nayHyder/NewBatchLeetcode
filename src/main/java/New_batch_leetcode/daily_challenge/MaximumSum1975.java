package New_batch_leetcode.daily_challenge;

public class MaximumSum1975 {
    public static long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int count=0;
        int miniPos=Integer.MAX_VALUE;
        int maxiNeg=Integer.MIN_VALUE;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(0>matrix[i][j]) {
                    count++;
                    maxiNeg=Math.max(maxiNeg,matrix[i][j]);
                }
                else
                    miniPos=Math.min(miniPos,matrix[i][j]);
            }
        }
        System.out.println("---- "+maxiNeg+"++++ "+miniPos);
            for (int i = 0; i <matrix.length; i++) {
                for (int j = 0; j <matrix[i].length ; j++) {
                    if(0>matrix[i][j])
                        sum+=matrix[i][j]*(-1);
                    else {
                        sum+=matrix[i][j];
                    }
                }
        }
            if(count%2!=0){
                int neg=Math.min(maxiNeg*(-1),miniPos);
                System.out.println("sum---"+sum);
                return sum-neg-neg;
            }
        return sum;
    }
    public static void main(String[] args) {
        int nums[][]={{1,2,3},{-1,-2,-3},{1,2,3}};
        System.out.println(maxMatrixSum(nums));
    }
}
