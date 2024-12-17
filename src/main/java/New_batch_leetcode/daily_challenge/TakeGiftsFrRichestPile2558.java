package New_batch_leetcode.daily_challenge;

import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFrRichestPile2558 {
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            maxHeap.add(gift);
        }
        System.out.println(maxHeap);
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            int largest = maxHeap.poll();
            int modified = (int) Math.sqrt(largest);
            maxHeap.add(modified);
        }
        long maxGiftSum = 0;
        while (!maxHeap.isEmpty()) {
            maxGiftSum += maxHeap.poll();
        }

        return maxGiftSum;
    }
    public static void main(String[] args) {
        System.out.println(pickGifts(new int[]{25,64,9,4,100},4));

    }
}
