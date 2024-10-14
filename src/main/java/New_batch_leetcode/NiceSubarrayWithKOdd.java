package New_batch_leetcode;

public class NiceSubarrayWithKOdd {

    public static int numberOfSubarrays(int[] nums, int k) {
        System.out.println();
      return atmost(nums,k)-atmost(nums,k-1);
    }
    public static int atmost(int nums[],int k){
        int sum=0;
        int start=0;
        int count=0;
        for (int end = 0; end <nums.length ; end++) {
            if (nums[end]%2!=0)
                count++;
            while (start<=end&& count>k){
                if (nums[start++]%2!=0)
                    count--;
            }
            System.out.println(end+" "+start);
            sum+=(end-start+1);
            System.out.println(sum+" ----");

        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1},3));
    }
}
