package New_batch_leetcode.daily_challenge;

import java.util.Deque;
import java.util.LinkedList;

public class SortestSubSumK862 {
    public static int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long[] prefixSum =new long[n+1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int minLength = n + 1;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {
                minLength = Math.min(minLength, i - deque.pollFirst());
            }
            while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.addLast(i);
        }
            return minLength == n + 1 ? -1 : minLength;

        }
    public static void main(String[] args) {
        System.out.println(shortestSubarray(new int[]{2,-1,2},3));
    }
}
