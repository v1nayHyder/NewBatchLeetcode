package New_batch_leetcode.daily_challenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class flipColoM1072{
    public static int maxEqualRowsAfterFlips(int[][] matrix) {
        int newMatrix[][]=new int[matrix.length][matrix[0].length];
        int count=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j]==0){
                    newMatrix[i][j]=1;
                }else {
                    newMatrix[i][j]=0;
                }

            }

        }
        System.out.println(Arrays.deepToString(newMatrix));
        System.out.println(Arrays.deepToString(matrix));
        return count;

    }
    public static void main(String[] args) {

        int nums[][]={{0,1},{1,1}};
        System.out.println(maxEqualRowsAfterFlips(nums));
    }
}
