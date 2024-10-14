package New_batch_leetcode;

import java.util.HashMap;
import java.util.Map;

class Node{


    int data;
    ListNode next;
    public Node(int data) {
        this.data = data;
        this.next = next;
    }

        }

public class LinkedListCycle {

//    public static boolean cycleLinked(Node head,int pos){
//        Node temNode=head;
//        int count =0;
//        int val=0;
//        while (temNode.data!=val &&temNode!=null) {
//            if (count++ == pos) {
//                val = temNode.data;
//            }
//            temNode=temNode.next;
//            if (temNode.next==null)
//                break;
//
//        }
//        if(temNode.data==val){
//            return true;
//        }
//        return  false;
//    }


     static boolean cycleLinked2(ListNode head) {

         Map<ListNode,Integer> cycle=new HashMap();
         ListNode temp=head;
         while (temp!=null){
             if (cycle.containsKey(temp)){
                 return true;
             }
             else {
                 cycle.put(temp,cycle.getOrDefault(temp,0)+1);
             }
             temp=temp.next;
         }
         return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(24);
        head.next = new ListNode(45);
        head.next.next = new ListNode(55);
        head.next.next.next = new ListNode(65);
        head.next.next.next.next = new ListNode(75);
        head.next.next.next.next.next = new ListNode(85);
//        head.next.next.next.next.next.next = head;
//        System.out.println(head.next.next.next.next.next.next.data);
//        int pos=1;
//        System.out.println(cycleLinked(head,pos));
        System.out.println(cycleLinked2(head));

//        display(head);
//        Node newNode=new Node(85);
//        Node head2=  deleteNode(head,newNode);
//        display(head2);

    }

}
