package New_batch_leetcode.striver_cheet_sheet.binary_trees;

public class SameTree100 {
    public static void main(String[] args) {
        // Create first tree (root1)
        TreeNode1 root1 = new TreeNode1(1);
        root1.left = new TreeNode1(2);
        root1.right = new TreeNode1(2);
        root1.left.left = new TreeNode1(3);
        root1.left.right = new TreeNode1(3);
        root1.left.left.left = new TreeNode1(4);
        root1.left.left.right = new TreeNode1(4);

        // Create second tree (root2)
        TreeNode1 root2 = new TreeNode1(1);
        root2.left = new TreeNode1(2);
        root2.right = new TreeNode1(2);
        root2.left.left = new TreeNode1(3);
        root2.left.right = new TreeNode1(3);
        root2.left.left.left = new TreeNode1(4);
        root2.left.left.right = new TreeNode1(9);

        // Compare root1 and root2
        System.out.println(isSameTree(root1, root2));
    }

    public static boolean isSameTree(TreeNode1 p, TreeNode1 q) {
        // If both nodes are null, they are the same
        if (p == null && q == null) {
            return true;
        }
        // If one node is null and the other is not, they are not the same
        if (p == null || q == null) {
            return false;
        }
        // If the values of the current nodes differ, they are not the same
        if (p.val != q.val) {
            return false;
        }
        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

// Definition for a binary tree node
class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val) {
        this.val = val;
        left = right = null;
    }
}
