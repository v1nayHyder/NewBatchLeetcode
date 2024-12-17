package New_batch_leetcode.binary_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderTraversal {
    public  static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if (root == null) return list;        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> val = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                val.add(node.data);

                // Enqueue left and right children if they exist
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(val);

        }

        return list;
    }
    public static void main(String[] args) {
      TreeNode treeNode=new TreeNode(3);
      treeNode.left=new TreeNode(9);
      treeNode.right=new TreeNode(20);
      treeNode.right.left=new TreeNode(15);
      treeNode.right.right=new TreeNode(7);
      List<List<Integer>> list=levelOrder(treeNode);
        System.out.println(list);
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        right=left=null;
    }
}
