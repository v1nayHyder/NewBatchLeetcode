package New_batch_leetcode;

import java.util.*;

/*904. Fruit Into Baskets
Medium
Topics
Companies
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.



Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
Example 3:

Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].


Constraints:

1 <= fruits.length <= 105
0 <= fruits[i] < fruits.length

 */
import java.util.Set;
import java.util.TreeSet;

public class FruitIntoBaskets {
    public static int totalFruits(int[] fruits) {
        int left = 0, right = 0, maxLength = 0, k = 2; // O(1) space
        Map<Integer, Integer> map = new HashMap<>(); // O(1) space (at most 2 distinct fruits)

        while (right < fruits.length) { // O(n) time
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1); // O(1) time

            while (map.size() > k) { // O(n) time in worst case
                map.put(fruits[left], map.get(fruits[left]) - 1); // O(1) time
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]); // O(1) time
                }
                left++; // O(1) time
            }

            maxLength = Math.max(maxLength, right - left + 1); // O(1) time
            right++; // O(1) time
        }

        return maxLength; // O(1) time
    }

/*
    // Total Time Complexity: O(n), where n is the length of the input array.
// Total Space Complexity: O(k), where k is the number of distinct fruits (at most 2).
    public static int totalFruits(int[] fruits) {
        int left = 0, right = 0, maxLength = 0, k = 2; // O(1) space
        Map<Integer, Integer> map = new HashMap<>(); // O(1) space (at most 2 distinct fruits)

        while (right < fruits.length) { // O(n) time
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1); // O(1) time

            while (map.size() > k) { // O(n) time in worst case
                map.put(fruits[left], map.get(fruits[left]) - 1); // O(1) time
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]); // O(1) time
                }
                left++; // O(1) time
            }

            maxLength = Math.max(maxLength, right - left + 1); // O(1) time
            right++; // O(1) time
        }

        return maxLength; // O(1) time
    }

 */


    // Total Time Complexity: O(n^2 * log k), where n is the length of the input array and k is the size of the set (at most 2).
// Total Space Complexity: O(1), as the maximum size of the TreeSet is limited to 2 elements, regardless of the input size.

//    public static int totalFruits(int fruits[]) {
//        int maxLength = 0; // O(1) space
//
//        for (int i = 0; i < fruits.length; i++) { // O(n) time
//            Set<Integer> set = new TreeSet<>(); // O(1) space (at most 2 distinct fruits in set)
//
//            for (int j = i; j < fruits.length; j++) { // O(n) time
//                set.add(fruits[j]); // O(log k) time, where k is the size of the set (at most 2)
//
//                if (set.size() <= 2) { // O(1) time
//                    maxLength = Math.max(maxLength, j - i + 1); // O(1) time
//                } else {
//                    break; // O(1) time
//                }
//            }
//        }
//
//        return maxLength; // O(1) time
//    }

    public static void main(String[] args) {
        System.out.println(totalFruits(new int[]{1, 2, 3, 2, 2})); // O(1) time
    }
}

