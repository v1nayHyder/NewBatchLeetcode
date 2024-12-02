package New_batch_leetcode.striver_cheet_sheet.basic_math;

public class CountDigitsGFG {
    static int evenlyDivides(int n) {
        int tem=n;
        int count=0;
        while (tem>0){
            int divisor=tem%10;
            if(divisor!=0&&n%divisor==0){
                count++;
            }
            tem=tem/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(evenlyDivides(20));
    }
}
