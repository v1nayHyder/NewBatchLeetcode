package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class ContructStrWtRepeatLimit2182 {
    public static void main(String[] args) {
        System.out.println(repeatLimitedString("cczazcc",3));
    }
    public static String repeatLimitedString(String s, int repeatLimit) {
     int[] frequency=new int[26];
       for(char ch:s.toCharArray()){
           frequency[ch-'a']++;
       }
        StringBuilder stringBuilder=new StringBuilder();
        int index=25;
        while (index>=0){
            if(frequency[index]==0){
                index--;
                continue;
            }
            int used=Math.min(frequency[index],repeatLimit);
            for (int i = 0; i <used ; i++) {
                stringBuilder.append((char) ('a' + index));
                System.out.print(stringBuilder+" ");

            }
            frequency[index]-=used;
            if (frequency[index]>0){
                int preIndex=index-1;
                while (preIndex>=0&&frequency[preIndex]==0){
                    preIndex--;
                }
                if (preIndex<0){
                    break;
                }
                stringBuilder.append((char)('a'+preIndex));
                frequency[preIndex]--;
            }
        }
        System.out.println(Arrays.toString(frequency));
        return stringBuilder.toString();
    }
}
