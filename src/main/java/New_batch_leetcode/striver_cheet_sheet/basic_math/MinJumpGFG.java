package New_batch_leetcode.striver_cheet_sheet.basic_math;

public class MinJumpGFG {
    static int minJumps(int[] arr) {
        int totalJump=0;
        for (int i = 0; i < arr.length-1; i+=arr[i]) {
            totalJump++;
        }
        return totalJump;
    }
    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
    }
}
