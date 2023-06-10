package JavaProgram.HeapPrograms;


import java.util.*;
public class KthsmallestElement {
	static int kthsmallestelement(int arr[],int k ){
		int n=arr.length;
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			pq.add(arr[i]);
			
			}
		
		// remove the k-1 elements from the heap
		
		int f = k - 1 ;

        while (f > 0) {
            pq.remove()  ;
            f-- ;
        }
        // return the top element which is our kth smallest element.
		return pq.peek();
		
	}

	public static void main(String[] args) {
		 int arr[] = {1, 2, 6, 4, 5, 3,0}  ;
		 
		 System.out.println("Kth Smallest element is : "+kthsmallestelement(arr,3))  ;

	}

}
