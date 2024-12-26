package New_batch_leetcode.striver_cheet_sheet.arrays;

public class SingleNumber136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1,1}));
    }
    public static int singleNumber(int[] nums) {
     int result=0;
     for (int num:nums){
         result^=num;
     }
     return result;
    }
}
