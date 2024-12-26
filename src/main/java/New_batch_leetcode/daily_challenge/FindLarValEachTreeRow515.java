package New_batch_leetcode.daily_challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLarValEachTreeRow515 {
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(3);
        root.right = new TreeNode2(2);
        root.left.left = new TreeNode2(5);
        root.left.right = new TreeNode2(3);
        root.right.right = new TreeNode2(9);
        System.out.println(largestValues(root));
    }

    public static List<Integer> largestValues(TreeNode2 root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode2> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode2 temp = q.poll();
                max = Math.max(max, temp.val);
                if (temp.left != null) 
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            result.add(max);
        }
        return result;
    }
}
class TreeNode2{
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2(int val){
        this.val = val;
        left = right = null;
    }
}

