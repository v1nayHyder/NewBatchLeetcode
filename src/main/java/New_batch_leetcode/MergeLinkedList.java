package New_batch_leetcode;

public class MergeLinkedList {
    static  class  Node{
        int data;
       Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static void mergeLinkedList(Node head1, Node head2){
        Node current=head1;
        while (current.next!=null){
            current=current.next;
        }
        current.next=head2;

    }
    public static void display(Node head){
        Node tem=head;
        while (tem!=null){
            System.out.print(tem.data+"-->");
            tem=tem.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        Node head=new Node(24);
        head.next=new Node(45);
        head.next.next=new Node(55);
        head.next.next.next=new Node(65);
        head.next.next.next.next=new Node(75);
        head.next.next.next.next.next=new Node(85);
        display(head);
        Node head2=new Node(24);
        head2.next=new Node(45);
        head2.next.next=new Node(55);
        head2.next.next.next=new Node(65);
        head2.next.next.next.next=new Node(75);
        head2.next.next.next.next.next=new Node(85);
        mergeLinkedList(head,head2);
        display(head);


    }
}
