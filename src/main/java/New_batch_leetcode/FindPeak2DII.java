package New_batch_leetcode;

import java.util.Arrays;
import java.util.Stack;

public class FindPeak2DII {
    public static int findMaxIndex(int findMax[][],int rows,int column){
        int maxValue=-1;
        int index=-1;
        for (int row = 0; row <rows ; row++) {
            if (findMax[row][column]>maxValue){
                maxValue=findMax[row][column];
                index=row;
            }

        }
        return index;
    }
    public static int[] findPeakGrid(int[][] matrix) {
     int rows=matrix.length;
     int columns=matrix[0].length;
     int low=0;
     int high=columns-1;
     while (low<=high){
         int mid=(high+low)/2;
         int maxRowIndex=findMaxIndex(matrix,rows,mid);
         int left=mid-1>=0?matrix[maxRowIndex][mid-1]:-1;
         int right=mid+1<columns?matrix[maxRowIndex][mid+1]:-1;
         if (matrix[maxRowIndex][mid]>left&&matrix[maxRowIndex][mid]>right){
             return new int[]{maxRowIndex,mid};
         } else if (matrix[maxRowIndex][mid]<left) {
             high=mid-1;

         }
         else {
             low=mid+1;
         }
     }
     return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int matrix[][]={{1,4},{3,2}};
      int res[]=(findPeakGrid(matrix));
        System.out.println(Arrays.toString(res));

    }
}
