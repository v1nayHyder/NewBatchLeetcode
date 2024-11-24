package New_batch_leetcode;

public class SeperateBlackAndWhiteBalls {
    public  static long minimumSteps(String s) {
        int swapCount=0;
        int end=0;
        for (int curr = 0; curr <s.length() ; curr++) {
            if(s.charAt(curr)=='0'){
                swapCount+=(curr-end);
                end++;
            }

        }
        return swapCount;

    }
    public static void main(String[] args) {
        System.out.println(minimumSteps("101"));
    }
}
