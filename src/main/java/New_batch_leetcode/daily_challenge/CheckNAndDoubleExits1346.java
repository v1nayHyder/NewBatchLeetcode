package New_batch_leetcode.daily_challenge;

import java.util.HashSet;

public class CheckNAndDoubleExits1346 {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }
        public static boolean checkIfExist(int[] arr) {

            /*this is optimal aprroach*/
            HashSet<Integer> set=new HashSet<>();
            for(int num:arr){
                if(set.contains(num*2)||((num%2==0)&&(set.contains(num/2))))
                    return true;
                  set.add(num);

            }


            /*this is better aprroach*/
//            for (int i = 0; i <arr.length ; i++) {
//                for (int j = 0; j < arr.length; j++) {
//                    if((i!=j)&&(arr[i]==2*arr[j])) {
//
//                        return true;
//                    }
//                }
//            }
return false;
    }
}
