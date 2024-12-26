package New_batch_leetcode.striver_cheet_sheet.arrays;

import java.util.Arrays;

public class RearrangeArrayEleBySign2149 {
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int[] result=rearrangeArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] rearrangeArray(int[] nums) {
        int result[]=new int[nums.length];
        int pos=0;
        int neg=1;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>=0){
                result[pos]=nums[i];
                pos+=2;
            }
            else {
                result[neg]=nums[i];
                neg+=2;
            }
        }
        return result;

//     int[] posEle=new int[nums.length/2];
//     int[] negEle=new int[nums.length/2];
//     int i=0,j=0;
//        for (int k = 0; k <nums.length ; k++) {
//            if (nums[k]>=0)
//               posEle[i++]=nums[k];
//            else
//                negEle[j++]=nums[k];
//        }
//
//        int p=0,q=0;
//        for (int k = 0; k < nums.length; k++) {
//            if(k%2==0)
//                nums[k]=posEle[p++];
//            else
//                nums[k]=negEle[q++];
//        }
//        return nums;
    }
}
