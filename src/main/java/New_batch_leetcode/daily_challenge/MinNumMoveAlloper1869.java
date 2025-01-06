package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class MinNumMoveAlloper1869 {
    public static void main(String[] args) {
        int[] res = minOperations("110");
        System.out.println(Arrays.toString(res));
    }

    public static int[] minOperations(String boxes) {

        int n = boxes.length();
        // O(N)
        int left[] = new int[n];
        left[0] = 0;
        int count = boxes.charAt(0) - '0';
        //left - O(N)
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + count;
            count += boxes.charAt(i) - '0';
        }
        //right - O(N)
        count = boxes.charAt(n - 1) - '0';
        int prevRight = 0;
        int curRight = 0;
        for (int i = n - 2; i >= 0; i--) {
            curRight = prevRight + count;
            prevRight = curRight;
            left[i] = left[i] + curRight;
            count += boxes.charAt(i) - '0';
        }
        return left;
    }
}