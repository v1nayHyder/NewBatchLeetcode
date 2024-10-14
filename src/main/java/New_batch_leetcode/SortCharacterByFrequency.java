package New_batch_leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> frequencyMap=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            frequencyMap.put(s.charAt(i),frequencyMap.getOrDefault(s.charAt(i),0)+1);

        }

        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->frequencyMap.get(b)-frequencyMap.get(a));
        maxHeap.addAll(frequencyMap.keySet());
        System.out.println(maxHeap);
        StringBuilder stringBuilder=new StringBuilder();
        while (!maxHeap.isEmpty()){
            char c=maxHeap.poll();
            int frequency=frequencyMap.get(c);
            for (int i = 0; i <frequency ; i++) {
                stringBuilder.append(c);
            }

        }

        System.out.println(frequencyMap+" ");
     return stringBuilder.toString();
    }
    public static void main(String[] args) {
       String s = "tree";
        System.out.println(frequencySort(s));
    }
}
