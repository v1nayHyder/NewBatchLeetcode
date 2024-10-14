package New_batch_leetcode;

public class SubArrayWithXOR {
    public static  int solve(int[] A, int B) {
        int count=0;
        for (int i = 0; i <A.length ; i++) {
            int sum=0;
            for (int j = i; j < A.length; j++) {
                sum^=A[j];
                if(sum==B){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 6, 7, 8, 9},5));
    }
}
