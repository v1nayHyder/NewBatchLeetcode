package New_batch_leetcode;

public class MergedListsOpt {
   static class Node{
       int val;
       Node next;
       Node(int val){
           this.val=val;
           this.next=null;
       }
   }
   static Node mergeLists(Node l1,Node l2){
       Node l3=new Node(-1);
       Node temp1=l1;
       Node temp2=l2;
       Node temp3=l3;
       System.out.println(temp3.val);
       while (temp1!=null&&temp2!=null){
         if (temp1.val>temp2.val){
             temp3.next=temp2;
             temp3=temp3.next;
             temp2=temp2.next;
         }
         else{
             temp3.next=temp1;
             temp3=temp3.next;
             temp1=temp1.next;
         }

       }
       if (temp1!=null){
           temp3.next=temp1;
       }
       else{
           temp3.next=temp2;
       }

       return l3.next;


   }
   static void display(Node head){
       Node temp=head;
       while (temp!=null){
           System.out.print(temp.val+"--->");
           temp=temp.next;
       }

       System.out.println("null");
   }


    public static void main(String[] args) {
       Node l1=new Node(12);
       l1.next=new Node(14);
       l1.next.next=new Node(20);
       l1.next.next.next=new Node(23);
       l1.next.next.next.next=new Node(25);
       l1.next.next.next.next.next=new Node(50);
       l1.next.next.next.next.next.next=new Node(70);
//       l1.next=new Node(14);
//       l1.next=new Node(14);
        Node l2=new Node(11);
        l2.next=new Node(15);
        l2.next.next=new Node(25);
       l2.next.next.next=new Node(30);
//       l1.next=new Node(14);
       Node l3= mergeLists(l1,l2);
//       display(l1);
//       display(l2);
       display(l3);




    }
}
