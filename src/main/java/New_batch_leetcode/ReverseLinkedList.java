package New_batch_leetcode;

public class ReverseLinkedList {
  static class Node {
       int data;
       Node next;

       public Node(int data) {
           this.data = data;

       }
   }
        static void display(Node head){
            Node currentNode=head;
            while (currentNode!=null){
                System.out.print(currentNode.data+"--->");
                currentNode=currentNode.next;
            }
            System.out.println("null");
        }
        static Node reverse(Node head) {
            for (int i = 0; i <3  ; i++) {
                Node preNode=head;
                Node currNode=head.next;
                Node temp=head;
                while (currNode.next!=null) {
                    preNode=currNode;
                    currNode=temp;
                    System.out.print(preNode.data+"-->"+currNode.data+"||");
                    break;
//                    preNode.next=preNode;
//                    currNode.next=currNode;


                }


            }
            return head;
        }
    public static void main(String[] args) {

        Node head1=new Node(12);
        head1.next=new Node(33);
        head1.next.next=new Node(43);
        head1.next.next.next=new Node(53);
//        head1.next.next.next.next=new Node(63);
//        head1.next.next.next.next.next=new Node(73);
        display(head1);
        Node node=reverse(head1);
        display(node);
    }
}
