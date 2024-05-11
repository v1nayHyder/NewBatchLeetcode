package New_batch_leetcode;

public class SortLinkedList {
   static class Node{
        int val;
        Node point;
        Node(int data){
            this.val=data;
            this.point=null;

        }
    }
    static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"--->");
            temp=temp.point;
        }
        System.out.println("null");
    }
    static void sortLinkedList(Node head){
       Node preNode=head;
       Node currNode=preNode.point;
       int tem=0;
       while (currNode!=null){
           if (preNode.val>currNode.val){
               tem=preNode.val;
               preNode.val=currNode.val;
               currNode.val=tem;
           }
           if (currNode.point==null){

               preNode=preNode.point;
               currNode=preNode.point;
//               System.out.println("pre="+preNode.val+"cur="+currNode.val);
           }
           if (preNode.point.point==null){
               if (preNode.val>currNode.val) {
                   tem = preNode.val;
                   preNode.val = currNode.val;
                   currNode.val = tem;
               }

           }
           currNode=currNode.point;
           if (currNode==null){

           }
       }
    }
    public static void main(String[] args) {
      Node head=new Node(10);
      head.point=new Node(5);
      head.point.point=new Node(15);
      head.point.point.point=new Node(0);
      head.point.point.point.point=new Node(2);
      display(head);
      sortLinkedList(head);
      display(head);

    }
}
