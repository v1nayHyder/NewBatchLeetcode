package New_batch_leetcode;

public class MinBitFlips {
        public static int minBitFlips(int start, int goal) {
            int ans = start ^ goal;
            System.out.println(ans+"---");
            int count = 0;
            while (ans != 0) {
                count += ans & 1;// Check the least significant bit
                System.out.println(count+"====="+ans);
                ans >>= 1;// Right shift by 1 to check the next bit
                System.out.println(ans+"____________________");
            }
            return count;

    }

    public static void main(String[] args) {
        System.out.println(minBitFlips(3,4));
    }


}
