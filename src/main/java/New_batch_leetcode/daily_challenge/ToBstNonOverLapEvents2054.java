package New_batch_leetcode.daily_challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;


public class ToBstNonOverLapEvents2054 {
    public static int maxTwoEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[1]));

        TreeMap<Integer, Integer> maxValueMap = new TreeMap<>();
        maxValueMap.put(0, 0);
        int maxSum = 0;

        for (int[] event : events) {
            int start = event[0];
            int end = event[1];
            int value = event[2];
            int maxPrevValue = maxValueMap.floorEntry(start - 1).getValue();
            System.out.println(maxValueMap+" 00 "+maxPrevValue);
            maxSum = Math.max(maxSum, maxPrevValue + value);
            maxValueMap.put(end, Math.max(maxValueMap.lastEntry().getValue(), value));
            System.out.println(maxValueMap+" 11");

        }

            return maxSum;
    }
    public static void main(String[] args) {
        System.out.println(maxTwoEvents(new int[][]{{1,3,2},{4,5,2},{2,4,3}}));
    }
}
