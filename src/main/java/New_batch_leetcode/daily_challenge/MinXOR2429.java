package New_batch_leetcode.daily_challenge;

public class MinXOR2429 {
    public static void main(String[] args) {
        System.out.println(minimizeXor(3,5));
    }
    public static int minimizeXor(int num1, int num2) {

        //find set bits in num2
        int setBits = Integer.bitCount(num2); //n & n-1 logN
        int bit=31;
        int res=0;
        while(bit>=0 && setBits>0){
            //check if bit is set in num1 and if so, set the bit in res
            if((num1 & (1 << bit)) !=0){
                res = res | (1 << bit);
                setBits--;
            }
            bit--;
        }
        bit = 0;
        // 1011001
        while(setBits>0 && bit<=32){
            if((num1 & (1 << bit)) == 0){
                res = res | (1 << bit);
                setBits--;
            }
            bit++;
        }
        return res;
    }
}
