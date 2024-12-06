package New_batch_leetcode.striver_cheet_sheet.binary_trees;

public class CountNumOfNodeOnLevelNGFG {
    static int countNodes(int i) {
        // optimal approach
        if(i==0||i==1)
            return i;
        return 1 << (i - 1);

        //better approach

        //     if(i==0||i==1)
        //      return i;
        //  return (int) Math.pow(2,i-1);
    }
    public static void main(String[] args) {
        System.out.println(countNodes(5));
    }
}
