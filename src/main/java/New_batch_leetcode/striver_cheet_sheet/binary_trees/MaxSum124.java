package New_batch_leetcode.striver_cheet_sheet.binary_trees;

public class MaxSum124 {
    public static void main(String[] args) {
        TreeNode1 root=new TreeNode1(1);
        root.left=new TreeNode1(2);
        root.right=new TreeNode1(2);
        root.left.left=new TreeNode1(3);
             root.left.right=new TreeNode1(3);
        root.left.left.left=new TreeNode1(4);
        root.left.left.right=new TreeNode1(4);
        System.out.println(maxPathSum(root));
    }
    public  static int maxPathSum(TreeNode1 treeNode) {
       int[] maxValue=new int[1];
       maxValue[0]=Integer.MIN_VALUE;
       dfs(treeNode,maxValue);
        return maxValue[0];
    }
    public static int dfs(TreeNode1 node, int [] maxValue){
        if(node==null)
            return 0;
        int leftSum=Math.max(0,dfs(node.left,maxValue));
        int rightSum=Math.max(0,dfs(node.right,maxValue));
        maxValue[0]=Math.max(maxValue[0],leftSum+rightSum+node.val);
        return Math.max(leftSum,rightSum)+node.val;
    }
}
