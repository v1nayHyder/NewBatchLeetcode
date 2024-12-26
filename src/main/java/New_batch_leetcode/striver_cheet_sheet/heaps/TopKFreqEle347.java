package New_batch_leetcode.striver_cheet_sheet.heaps;

import java.util.*;

public class TopKFreqEle347 {
    public static void main(String[] args) {
        int [] nums={3,3,1,1,1,3,2,2,3};
        int k=2;
        int [] freq=topKFrequent(nums,k);
        System.out.println(Arrays.toString(freq)+"--->");
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                    queue.offer(entry);
                    if (queue.size()>k)
                        queue.poll();
        }
        System.out.println(queue);
        int[] kFreq=new int[k];
        int i=0;
        while (!queue.isEmpty()){
            kFreq[i++]=queue.poll().getKey();
        }
        return kFreq;
    }
}
