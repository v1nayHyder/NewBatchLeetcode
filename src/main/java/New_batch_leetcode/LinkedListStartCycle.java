package New_batch_leetcode;
import java.util.HashMap;
import java.util.Map;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
public class LinkedListStartCycle {
    public static ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        Map<ListNode, Integer> cycleList=new HashMap<>();
        ListNode tempNode=head;
        while(tempNode!=null){
               if (cycleList.containsKey(tempNode)){
                   System.out.println(tempNode.data);
                   return tempNode;
               }
               cycleList.put(tempNode,cycleList.getOrDefault(tempNode,0)+1);
               tempNode=tempNode.next;

        }
        System.out.println(cycleList.size());
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(24);
        head.next = new ListNode(45);
        head.next.next = new ListNode(55);
        head.next.next.next = new ListNode(65);
        head.next.next.next.next = new ListNode(75);
        head.next.next.next.next.next = new ListNode(85);
        head.next.next.next.next.next.next=head.next.next;
       ListNode node= detectCycle(head);
        System.out.println(node);
    }
}