package New_batch_leetcode;
/*
73. Set Matrix Zeroes
Solved
Medium
Topics
Companies
Hint
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
 */
import java.util.Arrays;

public class SetMatrixZeros {
        public static void setZeroes(int[][] matrix) {
   int n=matrix.length;
   int m=matrix[0].length;
    int col0 = 1;
    // step 1: Traverse the matrix and
    // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j]== 0) {
                // mark i-th row:
                matrix[i][0]=0;

                // mark j-th column:
                if (j != 0)
                    matrix[0][j]=0;
                else
                    col0 = 0;
            }
        }
    }

    // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            if (matrix[i][j] != 0) {
                // check for col & row:
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j]=0;
                }
            }
        }
    }

    //step 3: Finally mark the 1st col & then 1st row:
        if (matrix[0][0] == 0) {
        for (int j = 0; j < m; j++) {
            matrix[0][j]=0;
        }
    }
        if (col0 == 0) {
        for (int i = 0; i < n; i++) {
            matrix[i][0]=0;
        }
    }
            System.out.println(Arrays.deepToString(matrix));

}


    //better apprach (n*n)
//    public static void setZeroes(int[][] matrix) {
//    int row[]=new int[matrix.length];
//    int column[]=new int[matrix[0].length];
//        for (int i = 0; i <matrix.length ; i++) {
//            for (int j = 0; j <matrix[i].length ; j++) {
//                if (matrix[i][j]==0){
//                    row[i]=1;
//                    column[j]=1;
//                }
//            }
//        }
//        for (int i = 0; i <matrix.length ; i++) {
//            for (int j = 0; j <matrix[i].length; j++) {
//                if (row[i]==1||column[j]==1){
//                    matrix[i][j]=0;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//    }
//


        // brute force approach n*n*n
//    public static void setZeroes(int[][] matrix) {
//        for (int i = 0; i <matrix.length ; i++) {
//            for (int j = 0; j <matrix[i].length ; j++) {
//                if (matrix[i][j]==0){
//                   marksRow(i,matrix);
//                   marksColumn(j,matrix);
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.deepToString(matrix));
//        for (int i = 0; i <matrix.length ; i++) {
//            for (int j = 0; j <matrix[i].length ; j++) {
//                if (matrix[i][j]==-1){
//                    matrix[i][j]=0;
//                }
//
//            }
//
//        }
//
//        System.out.println(Arrays.deepToString(matrix));
//    }
//
//    static void marksRow(int i, int[][] m1) {
//        for (int j = 0; j < m1[i].length; j++) { // Fixed the loop limit to m1[i].length
//            if (m1[i][j] != 0) {
//                m1[i][j] = -1;
//            }
//        }
//    }
//
//    static void marksColumn(int j, int[][] m2) {
//        for (int i = 0; i < m2.length; i++) { // Fixed the loop limit to m2.length
//            if (m2[i][j] != 0) {
//                m2[i][j] = -1;
//            }
//        }
//    }
    public static void main(String[] args) {
        setZeroes(new int[][]{{0,1,1},{1,1,1}});
    }
}
