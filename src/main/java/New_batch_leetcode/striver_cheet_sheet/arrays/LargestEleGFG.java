package New_batch_leetcode.striver_cheet_sheet.arrays;

public class LargestEleGFG {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{1, 8, 7, 56, 90}));
    }
    public static int largest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max=Math.max(num,max);
        }
        return max;
    }

}
