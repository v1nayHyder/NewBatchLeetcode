package New_batch_leetcode;

public class KthMissPosNum {
    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<=k)
                k++;
            else
                break;

        }
        return k;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=2;
        System.out.println(findKthPositive(arr,k));
    }
}
