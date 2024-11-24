package New_batch_leetcode.daily_challenge;

import java.util.Arrays;

public class MostBeautyItem2070 {
    public static int[] maximumBeauty(int[][] items, int[] queries) {
     int beauty[]=new int[queries.length];
        for (int i = 0; i <queries.length ; i++) {
            int item=Integer.MIN_VALUE;
            for (int j = 0; j <items.length ; j++) {
              if(queries[i]>=items[j][0]&&item<items[j][1]){
                  item=items[j][1];
              }
            }
            beauty[i]=item;

        }
        return beauty;
    }
    public static void main(String[] args) {

        int[][] items ={{1,2},{3,2},{2,4},{5,6},{3,5}};
        int[] queries ={1,2,3,4,5,6};
        int[] maxBeauties =maximumBeauty(items,queries);
        System.out.println(Arrays.toString(maxBeauties));
    }
}
