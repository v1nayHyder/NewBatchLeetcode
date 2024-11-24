package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class RotatingBox1861 {
    public static char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] rotatedBox = new char[n][m];

        // Process each row to simulate stone falling due to gravity
        for (int i = 0; i < m; i++) {
            int emptySlot = n - 1; // Position where the next stone should fall
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    // Obstacle encountered; reset the empty slot pointer
                    emptySlot = j - 1;
                } else if (box[i][j] == '#') {
                    // Move stone to the last empty slot
                    box[i][j] = '.';
                    box[i][emptySlot] = '#';
                    emptySlot--;
                }
            }
        }

        // Rotate the box clockwise
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedBox[j][m - i - 1] = box[i][j];
            }
        }

        return rotatedBox;
    }

    public static void main(String[] args) {
        char[][] boxChars = {{'#', '.', '*', '.'}, {'#', '#', '*', '.'}};
        char[][] result = rotateTheBox(boxChars);
        System.out.println(Arrays.deepToString(result));
    }
}
