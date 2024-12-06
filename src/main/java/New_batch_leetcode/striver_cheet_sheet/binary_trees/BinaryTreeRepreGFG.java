package New_batch_leetcode.striver_cheet_sheet.binary_trees;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeRepreGFG {


    public static void createTree(Node root0, ArrayList<Integer> v ){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root0);
        int index=1;
        while (!queue.isEmpty()&&index<v.size()){
            Node current=queue.poll();
            if (index<v.size()){
                current.left=new Node(v.get(index++));
                queue.add(current.left);
            }
            if (index<v.size()){
                current.right=new Node(v.get(index++));
                queue.add(current.right);
            }
        }
    }
    public static void Traversal(Node node){
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node current=queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(i); // Populate the ArrayList with values 1 to 7
        }

        Node root=new Node(list.get(0));
       createTree(root,list);
       Traversal(root);
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
        left=right=null;
    }
}
