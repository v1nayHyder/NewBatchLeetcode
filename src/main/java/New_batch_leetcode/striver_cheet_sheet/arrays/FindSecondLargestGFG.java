package New_batch_leetcode.striver_cheet_sheet.arrays;

public class FindSecondLargestGFG {
    public static void main(String[] args) {

        System.out.println(getSecondLargest(new int[]{10, 10, 10}));
    }
    public static int getSecondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int num:arr){
            max=Math.max(num,max);
        }
        int secLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if (num!=max){
                secLargest=Math.max(num,secLargest);
            }
        }
        return secLargest<0?-1:secLargest;
    }

}
