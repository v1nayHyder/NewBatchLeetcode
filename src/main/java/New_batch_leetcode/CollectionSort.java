package New_batch_leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution1 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            System.out.println(i+"---------------");
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
//
//        int[][] intervals1 = {{1, 3}, {6, 9}};
//        int[] newInterval1 = {2, 5};
//        int[][] result1 = solution.insert(intervals1, newInterval1);
//        printIntervals(result1); // Expected output: [[1, 5], [6, 9]]

        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        int[][] result2 = solution.insert(intervals2, newInterval2);
        printIntervals(result2); // Expected output: [[1, 2], [3, 10], [12, 16]]
//
//        int[][] intervals3 = {};
//        int[] newInterval3 = {5, 7};
//        int[][] result3 = solution.insert(intervals3, newInterval3);
//        printIntervals(result3); // Expected output: [[5, 7]]

//        int[][] intervals4 = {{1, 5}};
//        int[] newInterval4 = {2, 3};
//        int[][] result4 = solution.insert(intervals4, newInterval4);
//        printIntervals(result4); // Expected output: [[1, 5]]
//
//        int[][] intervals5 = {{1, 5}};
//        int[] newInterval5 = {2, 7};
//        int[][] result5 = solution.insert(intervals5, newInterval5);
//        printIntervals(result5); // Expected output: [[1, 7]]
    }

    private static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println();
    }
}
