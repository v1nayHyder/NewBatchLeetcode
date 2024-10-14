package New_batch_leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedList2 {
    static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    static ArrayList<Integer> arrayList=new ArrayList<>();
    public static void display(Node head1){
    Node tem=head1;
    while (tem!=null){
        System.out.print(tem.data+"--->");
        arrayList.add(tem.data);
        tem=tem.next;
    }
        System.out.println("null");
    }
    public static Node newLinkedList() {
        Collections.sort(arrayList);
        Node head=new Node(arrayList.get(0));
        Node temp=head;
        for (Integer val:arrayList) {
            if (head.data!=val) {
                temp.next = new Node(val);
                temp = temp.next;
            }
        }

    return head;

    }


    public static void main(String[] args) {

    Node head1=new Node(23);
    head1.next=new Node(33);
    head1.next.next=new Node(43);
    head1.next.next.next=new Node(53);
    head1.next.next.next.next=new Node(63);
    head1.next.next.next.next.next=new Node(73);
    display(head1);
    Node head2=new Node(22);
    head2.next=new Node(32);
    head2.next.next=new Node(42);
    head2.next.next.next=new Node(52);
    head2.next.next.next.next=new Node(62);
    head2.next.next.next.next.next=new Node(72);
    display(head2);
    Node newHead=newLinkedList();
    display(newHead);
    }
}
