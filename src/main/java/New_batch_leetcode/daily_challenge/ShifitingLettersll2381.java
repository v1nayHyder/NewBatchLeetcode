package New_batch_leetcode.daily_challenge;

import java.util.ArrayList;
import java.util.List;

public class ShifitingLettersll2381 {
    public static void main(String[] args) {
        String str = "abc";
        int[][] shifts = { {0, 1, 0}, {1, 2, 1}, {0, 2, 1} };
        System.out.println(shiftLetters(str, shifts));
    }

    public static String shiftLetters(String s, int[][] shifts) {
        List<Character> alphabet = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }

        StringBuilder stringBuilder = new StringBuilder(s);
        int current = 0, n = shifts.length;

        while (current < n) {
            int start = shifts[current][0];
            int end = shifts[current][1];
            int direction = shifts[current][2];

            while (start <= end) {
                char ch = stringBuilder.charAt(start);
                int index = alphabet.indexOf(ch);

                if (direction == 0) {
                    // Shift backward
                    index = (index - 1 + 26) % 26; // Ensure index stays within bounds
                } else {
                    // Shift forward
                    index = (index + 1) % 26;
                }

                stringBuilder.setCharAt(start, alphabet.get(index));
                start++;
            }
            current++;
        }

        return stringBuilder.toString();
    }
}
