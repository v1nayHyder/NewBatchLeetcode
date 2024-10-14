package New_batch_leetcode.binary_trees;

public class ImplementBinaryTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }
    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }

        // Recursively print the left subtree
        printInOrder(root.left);

        // Print the data of the current node
        System.out.print(root.data + " ");

        // Recursively print the right subtree
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        ImplementBinaryTree implementBinaryTree=new ImplementBinaryTree();
        Node root=implementBinaryTree.new Node(10);
        root.left=implementBinaryTree.new Node(8);
        root.left.left=implementBinaryTree.new Node(3);
        root.left.right=implementBinaryTree.new Node(4);
        root.right=implementBinaryTree.new Node(9);
        root.right.left=implementBinaryTree.new Node(5);
        root.right.right=implementBinaryTree.new Node(7);
        printInOrder(root);

    }
}
