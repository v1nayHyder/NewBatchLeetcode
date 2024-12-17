package New_batch_leetcode.daily_challenge;

public class CountinuousSubarray2762 {
    public static void main(String[] args) {
        System.out.println(continuousSubarrays(new int[]{5,4,2,4}));
    }
    public static long continuousSubarrays(int[] nums) {
      int n=nums.length;
      int start=0;
      int end=0;
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      int count=0;
      while (end<n){
          max=Math.max(nums[end],max);
          min=Math.min(nums[end],min);
          if (max-min>2){
              start=end;

              max=nums[end];
              min=nums[end];
              while (start-1>=0&&Math.abs(nums[start-1]-nums[end])<=2){
                  start--;
                  max=Math.max(nums[end],max);
                  min=Math.min(nums[start],min);
              }
          }
          count+=(end-start+1);
          end++;

      }
      return count;
    }
}
