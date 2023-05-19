package JavaProgram.Array;

import java.util.*;
public class KthLargestElement {
	static int kthlargest(int arr[],int k) {
		
		PriorityQueue<Integer>pq=new PriorityQueue<>(k+1);
		for(int i:arr) {
			pq.add(i);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		return pq.poll();
		
	}

	public static void main(String[] args) {
		int arr[]= {1,9,8,4,3,6,7};
		int k=3;
		System.out.print(k+"th largest element is:"+kthlargest(arr,k));

	}

}
