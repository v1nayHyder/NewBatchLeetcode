package New_batch_leetcode;
public class MergeTwoSortedList {
    Node head;
    Node head1;
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public   void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node currentNode=head;
            while (currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
            currentNode=currentNode.next;
        }
    }
    public void display()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        else {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public void deleteLast()
    {
        if (head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else if (head.next==null)
        {
            System.out.println("List have only one Node");
        }
        else {
            Node preNode=head;
            Node curNode=head.next;
            while (curNode.next!=null)
            {
                preNode=curNode;
                curNode=curNode.next;
            }
            preNode.next=null;
        }
    }
    public  void deleteMet2(){
        if (head==null||head.next==null)
        {
            System.out.println("List is empty or have only one Node");
            return;
        }
        else{
            Node temp=head;
            while (temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void  deleteSecondLast()
    {
        if (head==null||head.next==null||head.next.next==null)
        {
            System.out.println("List is empty or have only one or two Node");
            return;
        }
   else {
       Node preNode=head;
       Node curNode=preNode.next;
       Node curNext=curNode.next;
       while (curNext.next!=null)
       {
           preNode=curNode;
           curNode=curNext;
           curNext=curNext.next;
       }
       preNode.next=curNext;
        }
    }
    public void  deleteSecondLast2()
    {
        if (head==null||head.next==null||head.next.next==null)
        {
            System.out.println("List is empty or have only one or two Node");
            return;
        }
        else {
            Node preNode=head;
            while (preNode.next.next.next!=null)
            {
                   preNode=preNode.next;
            }
            preNode.next=preNode.next.next;
        }
    }
    public void  deleteSecond()
    {
        if (head==null||head.next==null||head.next.next==null)
        {
            System.out.println("List is empty or have only one or two Node");
            return;
        }
        else
        {
            Node preNode=head;
            int count=1;
            while (count <=2)
            {
              if (count++==2)
              {
                  head.next=preNode.next;
                  return;
                }
                preNode=preNode.next;
            }
        }
    }

    public   void add1(int data)
    {
        Node newNode=new Node(data);
        if(head1==null)
        {
            head1=newNode;

        }
        else
        {
            Node currentNode=head1;
            while (currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
            currentNode=currentNode.next;


        }
//        System.out.println(head1.data);
    }
    public void display1()
    {
        if (head1 == null)
        {
            System.out.println("List2 is empty");
            return;
        }
        else {
            Node temp = head1;
            while (temp != null)
            {
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public void mergeTwo(){
        Node node=head;
        while (node.next!=null){
            node=node.next;
        }
       node.next=head1;
    }
    public static void main(String[] args)
    {
        MergeTwoSortedList mergeTwoSortedList=new MergeTwoSortedList();
        mergeTwoSortedList.add(10);
        mergeTwoSortedList.add(20);
        mergeTwoSortedList.add(30);
        mergeTwoSortedList.add(40);
        mergeTwoSortedList.add(50);
        mergeTwoSortedList.add(60);
        mergeTwoSortedList.add(70);
//        mergeTwoSortedList.display();
        mergeTwoSortedList.deleteLast();
//        mergeTwoSortedList.display();
        mergeTwoSortedList.deleteMet2();
//        mergeTwoSortedList.display();
        mergeTwoSortedList.deleteSecondLast();
//        mergeTwoSortedList.display();
        mergeTwoSortedList.deleteSecondLast2();
//        mergeTwoSortedList.display();
        mergeTwoSortedList.deleteSecond();
        mergeTwoSortedList.display();

        mergeTwoSortedList.add1(23);
        mergeTwoSortedList.add1(33);
        mergeTwoSortedList.add1(43);
        mergeTwoSortedList.add1(53);
        mergeTwoSortedList.add1(63);
        mergeTwoSortedList.mergeTwo();
        mergeTwoSortedList.display1();
        mergeTwoSortedList.display();


    }
}