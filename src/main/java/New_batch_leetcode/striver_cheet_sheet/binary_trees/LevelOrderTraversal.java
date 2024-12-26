package New_batch_leetcode.striver_cheet_sheet.binary_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderTraversal {
    public  static List<List<Integer>> levelOrder(TreeNode4 root) {
        List<List<Integer>>list=new ArrayList<>();
        if (root == null) return list;        Queue<TreeNode4> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> val = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode4 node = queue.poll();
                val.add(node.val);

                // Enqueue left and right children if they exist
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(val);

        }

        return list;
    }
    public static void main(String[] args) {
      TreeNode4 treeNode=new TreeNode4(3);
      treeNode.left=new TreeNode4(9);
      treeNode.right=new TreeNode4(20);
      treeNode.right.left=new TreeNode4(15);
      treeNode.right.right=new TreeNode4(7);
      List<List<Integer>> list=levelOrder(treeNode);
        System.out.println(list);
    }
}
class TreeNode{
    int data;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode(int data){
        this.data=data;
        right=left=null;
    }
}
