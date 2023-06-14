package JavaProgram.HeapPrograms;

import java.util.PriorityQueue;

public class ConnectRopestoMinimiseCost {
	
	static int connectropes(int arr[]) {
		int n=arr.length;
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		//add all ropes to heap
		for(int i=0;i<n;i++) {
			pq.add(arr[i]);
		}
		
		int cost=0;
		while(pq.size()>1) {
			int first=pq.poll();
			int second=pq.poll();
			 cost=cost+first+second;
			 pq.add(first+second);
		}
		// return the minimum cost
		return cost;
		
	}

	public static void main(String[] args) {
		int ropes[] = {4, 3, 2, 6};
		
		System.out.println("The minimum cost is : "+connectropes(ropes));
	}

}
