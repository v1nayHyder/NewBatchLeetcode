package New_batch_leetcode.striver_cheet_sheet.binary_trees;



public class BalancedBinaryTree110 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(3);
        root.left.left.left=new TreeNode(4);
        root.left.left.right=new TreeNode(4);
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        return dfs(root)!=-1;
    }
    public static int dfs(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHight=dfs(node.left);
        if(leftHight==-1)
            return -1;
        int rightHight=dfs(node.right);
        if(rightHight==-1){
            return -1;
        }
        if(Math.abs(leftHight-rightHight)>1)
            return -1;
        return Math.max(leftHight,rightHight)+1;
    }
}
