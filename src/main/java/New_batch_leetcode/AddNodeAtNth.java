package New_batch_leetcode;

public class AddNodeAtNth {
   static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   static int size=0;
    static public void display(Node head){
       Node currNode=head;
       while (currNode!=null){
           System.out.print(currNode.data+"-->");
           currNode=currNode.next;
       }
        System.out.println("null");

    }
    static  public void size(Node head){
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        System.out.println(size);
    }
    static Node removeNth(Node head,int n){
      int count=size-n;
        System.out.println(count);
      if (count==0)
          head=head.next;
      return head;
    }

    public static void main(String[] args) {
        Node  head= new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);
//        head.next.next.next.next.next=new Node(96);
        display(head);
        size(head);
        Node head1=removeNth(head,7);
        display(head1);

    }
}
