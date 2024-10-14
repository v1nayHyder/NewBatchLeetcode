package New_batch_leetcode;

public class DeleteNodeLD {
    static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static void display(Node head){
       Node tem=head;
        while (tem!=null){
            System.out.print(tem.data+"-->");
            tem=tem.next;
        }
        System.out.println("null");

    }
    static Node deleteNode(Node head,Node target){
        if (head.data==target.data){
            return head.next;
        }
//        Node prev=null;
        Node current=head;
        Node nextNode=current;
        while (nextNode.next!=null){
            if (nextNode.next.data==target.data){
                nextNode.next=nextNode.next.next;
                break;
            }
            else {
                nextNode=nextNode.next;
            }

        }
        return head;
    }
    public static void main(String[] args) {
            Node head=new Node(24);
            head.next=new Node(45);
            head.next.next=new Node(55);
            head.next.next.next=new Node(65);
            head.next.next.next.next=new Node(75);
            head.next.next.next.next.next=new Node(85);
            display(head);
            Node newNode=new Node(85);
            Node head2=  deleteNode(head,newNode);
            display(head2);

    }
}
