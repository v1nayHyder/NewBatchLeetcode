package New_batch_leetcode.striver_cheet_sheet.binary_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTZigZgOdrLvlTr103 {
    public static void main(String[] args) {
        TreeNode1 root=new TreeNode1(1);
        root.left=new TreeNode1(2);
        root.right=new TreeNode1(4);
        root.left.left=new TreeNode1(3);
        root.left.right=new TreeNode1(3);
        root.left.left.left=new TreeNode1(4);
        root.left.left.right=new TreeNode1(4);
    List<List<Integer>> list=zigzagLevelOrder(root);
        System.out.println(list);
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode1 root) {

     List<List<Integer>> list=new ArrayList<>();
        if (root==null){
            return list;
        }
        Queue<TreeNode1> queue=new LinkedList<>();
        queue.offer(root);
        boolean leftToRight=true;
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            while (size>0){
                TreeNode1 node=queue.poll();
                if (leftToRight){
                    level.add(node.val);
                }else {
                    level.add(0,node.val);
                }
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            list.add(level);
            leftToRight=!leftToRight;
        }
        return list;


    }
}
