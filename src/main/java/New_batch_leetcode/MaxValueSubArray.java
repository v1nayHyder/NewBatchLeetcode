package New_batch_leetcode;

public class MaxValueSubArray {
    public static int maxValue(int nums[]){
        int max=nums[0];
        int n=nums.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            max=Math.max(sum,max);
            if (sum<0){
              sum=0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{1,2,-9,5,-2}));
    }
}
