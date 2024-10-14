package New_batch_leetcode;
/*875. Koko Eating Bananas
Medium
Topics
Companies
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.



Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23


Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109

 */
public class KokoEatingBananas {
    /*
Total Time Complexity: O(n + n * log(maxPile)) = O(n * log(maxPile))
  - O(n) to find the maximum pile size
  - O(log(maxPile)) for binary search iterations
  - O(n) to compute hours needed at each iteration of binary search

Total Space Complexity: O(1)
  - No additional space proportional to input size is used
*/
    public static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;

        // O(n) to find the maximum pile size
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }

        // O(log(maxPile) * n) for binary search over speed
        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if (canEatInTime(piles, h, mid)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    private static boolean canEatInTime(int[] piles, int hour, int speed) {
        int hours = 0;

        // O(n) to compute the total hours needed at a given speed
        for (int pile : piles) {
            hours += (int) Math.ceil((double) pile / speed);
        }
        return hours <= hour;
    }



    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11},8));
    }
}
