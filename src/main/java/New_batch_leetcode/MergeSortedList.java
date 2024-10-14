package New_batch_leetcode;

public class MergeSortedList {
     static class Node{
        int data;
        Node link;
        Node(int data){
            this.data=data;
            this.link=null;
        }
    }
    static void display(Node head1){
        if(head1==null){
            System.out.println("Check your both list Is anyone empty if yes then you can not perform operation");
            return;
        }
        else {
            Node temp=head1;
            while (temp!=null){
                System.out.print(temp.data+"--->");
                temp=temp.link;
            }
            System.out.println("null");
        }
    }
    static void mergeList(Node head1,Node head2){
         Node curNode1=head1;
         Node curNode2=head2;
         boolean check=true;
         while (curNode1.link!=null) {
             while (curNode2 != null){

                 if (curNode1.data > curNode2.data) {
                     check=false;
                     break;


                 }
                 curNode2 = curNode2.link;
         }
             curNode1=curNode1.link;
         }
         if (check)
             curNode1.link=head2;
    }
    public static void main(String[] args) {
        Node head1=new Node(12);
        head1.link=new Node(13);
        head1.link.link=new Node(14);
        head1.link.link.link=new Node(15);
        head1.link.link.link.link=new Node(16);
        head1.link.link.link.link.link=new Node(17);
//        display(head1);
        Node head2=new Node(18);
        head2.link=new Node(19);
//        head2.link.link=new Node(14);
//        head2.link.link.link=new Node(15);
//        head2.link.link.link.link=new Node(16);
//        head2.link.link.link.link.link=new Node(17);
        display(head1);
        mergeList(head1,head2);
        display(head1);


    }

}
