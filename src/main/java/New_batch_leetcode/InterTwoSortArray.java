package New_batch_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class InterTwoSortArray {
//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1); // Time: O(n log n), Space: O(log n) due to sorting
//        Arrays.sort(nums2); // Time: O(m log m), Space: O(log m) due to sorting
//        List<Integer> list = new ArrayList<>(); // Space: O(1)
//        int i = 0, j = 0; // Space: O(1)
//
//        // Time: O(n + m) for the while loop, Space: O(1) for the loop variables
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] == nums2[j]) {
//                if (!list.contains(nums1[i])) { // Time: O(k) for contains check, where k is the size of list
//                    list.add(nums1[i]); // Time: O(1) amortized
//                }
//                i++; // Time: O(1)
//                j++; // Time: O(1)
//            } else if (nums1[i] > nums2[j]) {
//                j++; // Time: O(1)
//            } else {
//                i++; // Time: O(1)
//            }
//        }
//
//        // Convert the list to an array
//        int[] result = new int[list.size()]; // Space: O(k), where k is the size of the list
//        // Time: O(k) for the for loop
//        for (int k = 0; k < list.size(); k++) {
//            result[k] = list.get(k); // Time: O(1)
//        }
//
//        return result; // Space: O(k)
//    }
/* optimal solution
Total Time Complexity: O(n log n + m log m + (n + m)) ≈ O(n log n + m log m)
- Sorting nums1: O(n log n)
- Sorting nums2: O(m log m)
- Loop to find intersection: O(n + m)
- Contains check and add operations within the loop: In the worst case, O(n * m), but more realistically O(k * (n + m)), where k is the number of unique elements in the intersection.
- Converting the list to an array: O(k)

Total Space Complexity: O(log n + log m + k) ≈ O(k)
- Sorting space complexity: O(log n) + O(log m)
- Space for the list of intersections: O(min(n, m))
- Space for the result array: O(min(n, m))
*/

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>(); // Space: O(1)
        int[] visited = new int[nums2.length]; // Space: O(m)

        // Time: O(n * m) in the worst case
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && visited[j] == 0) { // Time: O(1)
                    if (!list.contains(nums2[j])) { // Time: O(k) for contains check, where k is the size of list
                        list.add(nums2[j]); // Time: O(1) amortized
                        visited[j] = 1; // Time: O(1)
                    }
                }
//                if (nums2[j] > nums1[i]) // Time: O(1)
//                    break;
            }
        }

        int[] nums = new int[list.size()]; // Space: O(k), where k is the size of the list
        int i = 0; // Space: O(1)
        ListIterator<Integer> listIterator = list.listIterator(); // Space: O(1)

        // Time: O(k) for the while loop
        while (listIterator.hasNext()) {
            nums[i++] = listIterator.next(); // Time: O(1)
        }

        return nums; // Space: O(k)
    }

    /* above is brute force approach
Total Time Complexity: O(n * m)
- Nested loops: O(n * m)
- Contains check within the loop: In the worst case, O(k * n * m), where k is the number of unique elements in the intersection
- Converting the list to an array: O(k)

Total Space Complexity: O(m + k) ≈ O(k)
- Space for visited array: O(m)
- Space for the list of intersections: O(min(n, m))
- Space for the result array: O(min(n, m))
*/
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]= {1,2,2};
        int nums[]=intersection(nums1,nums2);
        System.out.println(Arrays.toString(nums));

    }
}
