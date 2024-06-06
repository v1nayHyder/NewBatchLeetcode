package New_batch_leetcode;
/*
1423. Maximum Points You Can Obtain from Cards
Medium
Topics
Companies
Hint
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.



Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
Example 2:

Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.
Example 3:

Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.


Constraints:

1 <= cardPoints.length <= 105
1 <= cardPoints[i] <= 104
1 <= k <= cardPoints.length
 */
public class MaxPointCard {
    // Overall time complexity: O(k)
// Space complexity: O(1) - only a few variables are used regardless of input size
    public static int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, maxSum = 0, rightSum = 0;

        // Calculate the initial leftSum and maxSum
        for (int i = 0; i < k; i++) { // O(k) time complexity
            leftSum = leftSum + cardPoints[i];
            maxSum = leftSum;
        }

        int rightIndex = cardPoints.length - 1; // O(1) time complexity

        // Slide the window from the end to the beginning
        for (int i = k - 1; i >= 0; i--) { // O(k) time complexity
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[rightIndex--];
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        return maxSum; // O(1) time complexity
    }
    public static void main(String[] args) {
        int[] cardPoints = {2, 2, 2};
        int k = 2;
        System.out.println(maxScore(cardPoints, k)); // O(1) time complexity

    }
}

