package New_batch_leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithKdifferentIntegers {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

    private static int atMostKDistinct(int[] nums, int k) {
        int left = 0, right = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            right++;

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            count += right - left;
        }

        return count;
    }



    // public static int subarraysWithKDistinct(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) { // O(n) where n is the length of nums
//            Map<Integer, Integer> map = new HashMap<>(); // O(1) space for map initialization
//            for (int j = i; j < nums.length; j++) { // O(n) nested loop
//                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1); // O(1) average time for put operation
//                if (map.size() == k)
//                    count++; // O(1)
//                else if (map.size() > k)
//                    break; // O(1)
//            }
//        }
//        return count;
//    }
//}
//
//// Overall time complexity: O(n^2) where n is the length of nums
//// Overall space complexity: O(k) where k is the maximum number of distinct elements in the map
    public static void main(String[] args) {
       int[] nums = {1,2,1,2,3};
        int k = 2;
        System.out.println(subarraysWithKDistinct(nums,k));
    }
}
