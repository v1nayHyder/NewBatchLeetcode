package New_batch_leetcode.striver_cheet_sheet.binary_trees;



public class BalancedBinaryTree110 {
    public static void main(String[] args) {
        TreeNode1 root=new TreeNode1(1);
        root.left=new TreeNode1(2);
        root.right=new TreeNode1(2);
        root.left.left=new TreeNode1(3);
        root.left.right=new TreeNode1(3);
        root.left.left.left=new TreeNode1(4);
        root.left.left.right=new TreeNode1(4);
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode1 root) {
        return dfs(root)!=-1;
    }
    public static int dfs(TreeNode1 node){
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
