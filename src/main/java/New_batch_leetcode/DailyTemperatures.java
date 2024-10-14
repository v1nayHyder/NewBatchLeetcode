package New_batch_leetcode;

import java.util.Arrays;
import java.util.Stack;

/*739. Daily Temperatures
Medium
Topics
Companies
Hint
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.



Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]


Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100

 */
public class DailyTemperatures {
    /*public static int[] dailyTemperatures(int[] temperatures) {

        // Overall time complexity: O(n^2), where n is the length of temperatures[]
        // Overall space complexity: O(n), where n is the length of temperatures[]

        int result[] = new int[temperatures.length]; // Space: O(n), Time: O(n), where n is the length of temperatures[]
        for (int i = 0; i < temperatures.length; i++) { // Time: O(n), where n is the length of temperatures[]
            int count = 0; // Space: O(1), Time: O(1)
            int value = 0; // Space: O(1), Time: O(1)
            for (int j = i + 1; j < temperatures.length; j++) { // Time: O(n), where n is the length of temperatures[]
                if (temperatures[i] < temperatures[j]) { // Time: O(1)
                    System.out.println(count); // Time: O(1)
                    value = temperatures[j]; // Time: O(1)
                    count++; // Time: O(1)
                    break; // Time: O(1)
                } else
                    count++; // Time: O(1)
            }
            if (temperatures[i] < value) // Time: O(1)
                result[i] = count; // Time: O(1)
        }
        return result; // Time: O(1)

    }*/

    public static int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> stack=new Stack<>();
        int result[] =new int[temperatures.length];
        for (int i = temperatures.length-1; i >=0 ; i--) {
            while (!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            if (!stack.isEmpty()){
               result[i]=stack.peek()-i;
            }
           stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
    int result[]=dailyTemperatures(new int[]{30,60,90});
        System.out.println(Arrays.toString(result));
    }
}
