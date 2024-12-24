package New_batch_leetcode.daily_challenge;

public class MakeChunkMkeSorted769 {
    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[]{4,3,2,1,0}));
    }
    public static int maxChunksToSorted(int[] arr) {
    int count=0;
    int max=Integer.MIN_VALUE;
    for (int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
        if (max<i+1){
            count++;
        }
    }
    return count;
    }
}
