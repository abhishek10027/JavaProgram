package JavaProgram.StackPrograms;

/*
 * Problem Statement: Implement a Stack using a single Queue.
 */

import java.util.*;

class stack {
    Queue < Integer > q = new LinkedList < > ();
    void push(int n) {
        q.add(n);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    int pop() {
        return q.remove();
    }
    int top() {
        return q.peek();
    }
    int size() {
        return q.size();
    }
}
public class ImplementStackUsingQueues {
	
	public static void main(String[] args) {
        stack s = new stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(1);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
	

}
