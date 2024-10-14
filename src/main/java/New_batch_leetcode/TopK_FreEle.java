package New_batch_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*347. Top K Frequent Elements
        Medium
        Topics
        Companies
        Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



        Example 1:

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
        Example 2:

        Input: nums = [1], k = 1
        Output: [1]


        Constraints:

        1 <= nums.length <= 105
        -104 <= nums[i] <= 104
        k is in the range [1, the number of unique elements in the array].
        It is guaranteed that the answer is unique.


        Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

 */

public class TopK_FreEle {
    public static int[] topKFrequent(int[] nums, int k) {
        // Creating a HashMap to count the frequency of each element
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // Creating an array of lists to use as buckets for frequencies
        List<Integer>[] bucket = new List[nums.length + 1];

        // Print bucket length (nums.length + 1)
        System.out.println(bucket.length); // This is just for debugging purposes and does not affect complexity

        // Populate the hashMap with the frequency of each number
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        // Time Complexity: O(n), where n is the length of nums

        // Populate the bucket array based on frequencies
        for (int key : hashMap.keySet()) {
            int frequency = hashMap.get(key);
            System.out.print(frequency + " "); // This is just for debugging purposes and does not affect complexity

            // Initialize the list at bucket[frequency] if it is null
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        // Time Complexity: O(n), where n is the number of unique keys in the hashMap

        // Prepare the result array
        int[] result = new int[k];
        int counter = 0;

        // Iterate over the bucket array from the end to the beginning to get the top k frequent elements
        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer num : bucket[pos]) {
                    result[counter++] = num;
                }
            }
        }
        // Time Complexity: O(n), in the worst case all elements are placed in buckets and are iterated

        // Print the bucket array, hashMap, and result array (for debugging)
        System.out.println(Arrays.toString(bucket)); // This is just for debugging purposes and does not affect complexity
        System.out.println(hashMap + "  " + Arrays.toString(bucket) + "  " + Arrays.toString(result)); // Debugging

        // The overall time complexity of the function is O(n), where n is the length of nums
        // The overall space complexity is O(n) due to the hashMap and bucket array
        return result;
    }
    public static void main(String[] args) {
        int result[]=topKFrequent(new int[]{1,1,1,2,2,3},2);
        System.out.println(Arrays.toString(result));
    }
}
