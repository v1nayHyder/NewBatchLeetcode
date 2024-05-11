package New_batch_leetcode;

public class AddDisplayLinkedList extends Exception{

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
    static Node addNthPosition(Node head,int index,int val) {
        Node newNode = new Node(val);
        ;
        if (index == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        int count = 2;
        Node preNode = head;
        Node currNode = preNode.next;
        while (preNode.next != null) {
            if (index == count) {
                preNode.next = newNode;
                newNode.next = currNode;
                return head;
            }

            count++;
            preNode = preNode.next;
            currNode = currNode.next;
            if (index > count && currNode.next==null)
                throw new IndexOutOfBoundsException("list size is less than index="+index);
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
        Node newHead=addNthPosition(head,1,95);
        display(newHead);
        Node newHead1=addNthPosition(newHead,2,95);
        display(newHead1);
        Node newHead2=addNthPosition(newHead,9,99);
        display(newHead2);

//        Node newHead3=addNthPosition(newHead,1,95);
//        display(newHead3);
//        Node newHead4=addNthPosition(head,1,95);
//        display(newHead4);
//        Node newHead5=addNthPosition(newHead3,9,44);
//        display(newHead5);



    }
}
