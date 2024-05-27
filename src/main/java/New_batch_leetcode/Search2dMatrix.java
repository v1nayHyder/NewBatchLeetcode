package New_batch_leetcode;

public class Search2dMatrix {
        public static boolean searchMatrix(int[][] matrix, int target) {
           //Time Complexity: O(n + m). In the worst case, you might traverse the whole height and width of the matrix.
            //Space Complexity: O(1). The space used by the algorithm does not depend on the size of the input matrix.

            // Time Complexity: O(1)
            System.out.println(matrix.length);

            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                // Space Complexity: O(1)
                return false;
            }

            int n = matrix.length;
            int m = matrix[0].length;

            // Initialize pointers to start at the bottom-left corner of the matrix
            int row = n - 1;
            int col = 0;

            // Time Complexity: O(n + m)
            while (row >= 0 && col < m) {
                if (matrix[row][col] == target) {
                    // Space Complexity: O(1)
                    return true;
                } else if (matrix[row][col] > target) {
                    row--;
                } else {
                    col++;
                }
            }

            // Space Complexity: O(1)
            return false;
        }

   /* public static boolean searchMatrix(int[][] matrix, int target) {
        //The total time complexity is O(n * m).
        //The total space complexity is O(1).//

            // Time Complexity: O(1)
            System.out.println(matrix.length);

            // Time Complexity: O(n) where n is the number of rows
            for (int i = 0; i < matrix.length; i++) {
                // Time Complexity: O(m) where m is the number of columns
                for (int j = 0; j < matrix[i].length; j++) {
                    // Time Complexity: O(1)
                    if (matrix[i][j] == target)
                        return true;
                }
            }

            // Space Complexity: O(1)
            return false;
        }*/



    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix,target));
    }
}
