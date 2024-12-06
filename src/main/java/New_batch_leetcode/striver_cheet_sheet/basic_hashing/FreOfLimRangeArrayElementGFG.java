package New_batch_leetcode.striver_cheet_sheet.basic_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreOfLimRangeArrayElementGFG {

    public static List<Integer> frequencyCount(int[] arr) {

     // optimal approach
        List<Integer> list=new ArrayList<>(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            list.add(0);
        }
        for (int i = 0; i <arr.length ; i++) {
            list.set(arr[i]-1,list.get(arr[i]-1)+1);
        }

        return list;
    }

//    public static List<Integer> frequencyCount(int[] arr) {
//        int eleFre[]=new int[arr.length];
//        List<Integer> list=new ArrayList<>();
//        for (int i = 0; i <arr.length ; i++) {
//            eleFre[arr[i]-1]++;
//        }
//        for (int num:eleFre)
//            list.add(num);
//        return list;
//    }
    public static void main(String[] args) {
      List<Integer> fre=frequencyCount(new  int[]{2, 3, 2, 3, 5});
        System.out.println(fre);
    }
}
