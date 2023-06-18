package JavaProgram.HeapPrograms;

/*
 * Basic priority queue program.
 */

import java.util.*;

public class PriorityQueues {
	public static void main(String[] args) {
		
		System.out.println("Enter the size of queue :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		// it will enter the elements into queue up to n.
		for(int i=0;i<n;i++) {
			pq.add(i);
		}
		
	// basic operations of the priority queue.
		System.out.println("The PriorityQueue is :"+pq);// it will print the queue elements.
		
		System.out.println("The top element of PriorityQueue is :"+pq.peek());// print the top element.
		
		pq.poll();// it will remove the top element of the queue.
		
		System.out.println("The new top element of PriorityQueue is :"+pq.peek());
		
		System.out.println("The PriorityQueue is :"+pq);
		}

}
