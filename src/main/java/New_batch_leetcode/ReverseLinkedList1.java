package New_batch_leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseLinkedList1 {
   static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
     static ArrayList<Integer> arrayList=new ArrayList();

    static void display(ListNode head){
       ListNode temp=head;
       while (temp!=null){
           System.out.print(temp.data+"-->");
           temp=temp.next;
       }
        System.out.println("null");
    }
    static void reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }


//        ListNode temp=head;
//        while (temp!=null){
//            arrayList.add(temp.data);
//            temp=temp.next;
//        }
//        System.out.println("arrayList:"+arrayList);
//        ListNode newHead=new ListNode(-1);
//        ListNode temp2=newHead;
//        for (int i = arrayList.size()-1; i >=0 ; i--) {
//            temp2.next=new ListNode(arrayList.get(i));
//            temp2=temp2.next;
//
//        }
//      if (head.next.next==null){
//
//          head=temp.next;
//          head.next=temp;
//          head.next.next=null;
//
//          System.out.println(temp.data+" 00 "+head.data+" 00 "+head.next.data);

//          return head;

//      }
   display(prev);

    }
    public static void main(String[] args) {
        ListNode head=new ListNode(12);
        head.next=new ListNode(34);
        head.next.next=new ListNode(44);
        head.next.next.next=new ListNode(54);
        display(head);
        reverseList(head);


    }
}
