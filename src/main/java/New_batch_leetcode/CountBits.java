package New_batch_leetcode;

public class CountBits {
    public static void main(String[] args) {
        int n = 5; // Example input
        int[] result = countBits(n);
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            System.out.println(ans[i>>1]+"  "+(i&1));
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
