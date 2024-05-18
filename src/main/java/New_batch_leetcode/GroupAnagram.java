package New_batch_leetcode;

import java.util.*;

public class GroupAnagram {
    /**
     * Groups anagrams from the given array of strings.
     *
     * @param strs An array of strings to be grouped by anagrams.
     * @return A list of lists of strings, where each sublist contains anagrams.
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        //Total time and space complexity
        // Time Complexity: O(N * K * log K)
        // - N is the number of strings.
        // - K is the maximum length of a string.
        // - Sorting each string takes O(K log K), and we do this for each of the N strings.
        // - Total: O(N * K * log K)

        // Space Complexity: O(N * K)
        // - N is the number of strings.
        // - K is the maximum length of a string.
        // - We use additional space to store the hash map and the lists of grouped anagrams.
        // - The hash map can have up to N keys (in the worst case where all strings are unique when sorted).
        // - Each key maps to a list of strings, and each string has a maximum length of K.
        // - Total: O(N * K)

        HashMap<String, List<String>> hashMap = new LinkedHashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array); // Sorting the string to use as a key
            String sorted = new String(array);
            if (!hashMap.containsKey(sorted)) {
                hashMap.put(sorted, new LinkedList<>());
                // Debug print to show the state of the hashMap after adding a new key
                System.out.println(hashMap);
            }
            hashMap.get(sorted).add(str);
            // Debug print to show the state of the hashMap after adding a string to the list
            System.out.println(hashMap);
        }

        // Returning the values of the hash map, which are lists of anagram groups
        return new LinkedList<>(hashMap.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
