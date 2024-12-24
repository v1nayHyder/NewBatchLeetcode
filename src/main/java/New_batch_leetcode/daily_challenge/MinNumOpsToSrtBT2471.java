package New_batch_leetcode.daily_challenge;

import java.util.*;

public class MinNumOpsToSrtBT2471 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        System.out.println(minimumOperations(root));
    }

    public static int minimumOperations(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int totalSwaps = 0;

        // Level order traversal
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            ArrayList<Integer> currentLevelValues = new ArrayList<>();

            // Collect nodes at the current level
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevelValues.add(currentNode.data);

                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }

            // Calculate swaps needed to sort this level
            totalSwaps += findMinSwaps(currentLevelValues);
        }

        return totalSwaps;
    }

    private static int findMinSwaps(ArrayList<Integer> values) {
        int size = values.size();
        int swapCount = 0;

        // Pair each value with its index
        List<int[]> valueIndexPairs = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            valueIndexPairs.add(new int[]{values.get(i), i});
        }

        // Sort based on value
        valueIndexPairs.sort(Comparator.comparingInt(pair -> pair[0]));

        // Check cycles for calculating minimum swaps
        boolean[] visited = new boolean[size];
        Arrays.fill(visited, false);

        for (int i = 0; i < size; i++) {
            // Skip if already visited or in correct position
            if (visited[i] || valueIndexPairs.get(i)[1] == i) {
                continue;
            }

            // Detect cycle length
            int cycleLength = 0;
            int currentIndex = i;

            while (!visited[currentIndex]) {
                visited[currentIndex] = true;
                currentIndex = valueIndexPairs.get(currentIndex)[1];
                cycleLength++;
            }

            // For a cycle of length N, minimum swaps needed: N - 1
            swapCount += (cycleLength - 1);
        }

        return swapCount;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}