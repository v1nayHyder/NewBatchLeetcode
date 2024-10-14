package New_batch_leetcode;

public class MaximumProductSubArray {
        public static int maxProduct(int[] nums) {
            int prefix=1,suffix=1;
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < nums.length ; i++) {
                if (prefix==0)
                    prefix=1;
                if (suffix==0)
                    suffix=1;
                prefix=prefix*nums[i];
                suffix=suffix*nums[nums.length-1-i];
                System.out.println(max+" "+prefix+" "+suffix);
                max=Math.max(max,Math.max(prefix,suffix));
                System.out.println(max);
            }
            return max;
        }


//    public static int maxProduct(int[] nums) {
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i <nums.length; i++) {
//            int product=1;
//            for (int j =i; j <nums.length ; j++) {
//                product*=nums[j];
//                if (product>max){
//                    max=product;
//                }
//
//            }
//
//        }
//        return max;
//    }
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
