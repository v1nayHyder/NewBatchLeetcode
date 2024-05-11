package New_batch_leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    static  class  Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        static ArrayList<Integer> arrayList=new ArrayList<>();
        static  Node addList(Node l1,Node l2){
            Node temp1=l1;
            while (temp1!=null){
                arrayList.add(temp1.data);
                temp1=temp1.next;
            }
            Node temp2=l2;
            while (temp2!=null){
                arrayList.add(temp2.data);
                temp2=temp2.next;
            }
            Collections.sort(arrayList);
            System.out.println(arrayList);
            Node head=new Node(arrayList.get(0));
            Node temp3=head;
//            System.out.println(temp3.data);
            for(int i=1;i<arrayList.size();i++){
                temp3.next=new Node(arrayList.get(i));
                temp3=temp3.next;
            }


            return head;
        }
        static  void display(Node head){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {
        Node head1=new Node(10);
        head1.next=new Node(90);
        Node head2=new Node(20);
        head2.next=new Node(30);
        head2.next.next=new Node(40);
       Node head= addList(head1,head2);
        display(head1);
        display(head2);
        display(head);

    }
}