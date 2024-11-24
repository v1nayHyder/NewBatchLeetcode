package New_batch_leetcode;

import java.util.Arrays;

public class FindKthBitInNthString4045 {
    public  static char findKthBit(int n, int k) {
        int len = (int)Math.pow(2,n) - 1;
        return recur(len,k);
    }
    public static char recur(int len, int k){
        //base case
        if(len == 1){
            return '0';
        }
        int half = len/2;
        int middle = half+1;
        System.out.println("len -> "+ len + " ,middle-> " + middle + " ,k-> "+ k);
        if(k==middle){
            return '1';
        }else if(k<middle){ //left
            return recur(half,k);
        }else { //right
            char ans = recur(half, 1 + len - k);
            return (ans == '0')?'1':'0';
        }
    }



//    public  static char findKthBit(int n, int k) {
//
//       String allbits[]=new String[n];
//       allbits[0]="0";
//        for (int i = 1; i <n ; i++) {
//            String tempString=allbits[i-1];
//            StringBuilder stringBuilder=new StringBuilder(tempString).reverse();
//            for (int j = 0; j < stringBuilder.length(); j++) {
//                char c = stringBuilder.charAt(j);
//                stringBuilder.setCharAt(j, c == '0' ? '1' : '0');
//            }
//            allbits[i]=tempString+"1"+stringBuilder;
//
//        }
//        System.out.println(Arrays.toString(allbits));
//     return allbits[n-1].charAt(k);
//    }

    public static void main(String[] args) {
        System.out.println(findKthBit(3,1));
    }

}
