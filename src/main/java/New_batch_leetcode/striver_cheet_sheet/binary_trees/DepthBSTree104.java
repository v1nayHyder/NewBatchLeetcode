package New_batch_leetcode.striver_cheet_sheet.binary_trees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DepthBSTree104 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int leftHight=maxDepth(root.left);
        int rightHight=maxDepth(root.right);
        return 1+Math.max(leftHight,rightHight);

    }
//        public static int maxDepth(TreeNode root) {
//        if(root==null)
//            return 0;
//        Queue<TreeNode> queue= new LinkedList<>();
//        int level=0;
//        queue.offer(root);
//        while (!queue.isEmpty()){
//               int size=queue.size();
//               while (size>0){
//                     TreeNode node=queue.poll();
//                     size--;
//                     if(node.left!=null){
//                         queue.offer(node.left);
//                     }
//                     if (node.right!=null){
//                         queue.offer(node.right);
//                     }
//               }
//               if (!queue.isEmpty()){
//                   level++;
//               }
//        }
//        return level+1;
//
//    }
}
class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val){
           this.val=val;
           left=right=null;

       }
}
