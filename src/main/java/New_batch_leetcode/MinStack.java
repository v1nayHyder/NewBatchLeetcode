package New_batch_leetcode;
/*155. Min Stack
        Medium
        Topics
        Companies
        Hint
        Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

        Implement the MinStack class:

        MinStack() initializes the stack object.
        void push(int val) pushes the element val onto the stack.
        void pop() removes the element on the top of the stack.
        int top() gets the top element of the stack.
        int getMin() retrieves the minimum element in the stack.
        You must implement a solution with O(1) time complexity for each function.



        Example 1:

        Input
        ["MinStack","push","push","push","getMin","pop","top","getMin"]
        [[],[-2],[0],[-3],[],[],[],[]]

        Output
        [null,null,null,null,-3,null,0,-2]

        Explanation
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2


        Constraints:

        -231 <= val <= 231 - 1
        Methods pop, top and getMin operations will always be called on non-empty stacks.
        At most 3 * 104 calls will be made to push, pop, top, and getMin.

 */

import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {
    class Node {
        private int val;
        private int min;
        private Node next;

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
            this.next = null;
        }
    }

    private Node head; // Space Complexity: O(n), where n is the number of elements in the stack.

    public MinStack() {
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // Pushes an element onto the stack.
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // Removes the top element of the stack.
    public void pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        head = head.next;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // Returns the value of the top element of the stack.
    public int top() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        return head.val;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // Returns the minimum value in the stack.
    public int getMin() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        return head.min;
    }

    public static void main(String[] args) {
        // Example usage:
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println(minStack.top());    // Returns 0
        System.out.println(minStack.getMin()); // Returns -2
    }
}
