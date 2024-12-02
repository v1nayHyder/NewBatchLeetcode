package New_batch_leetcode.striver_cheet_sheet.basic_recursion;

public class PrintNameNTimes {
    static void printGfg(int N) {
        if(N==0)
            return;
        System.out.println("Vinay");
        printGfg(N-1);
    }
    public static void main(String[] args) {
        printGfg(4);
    }
}
