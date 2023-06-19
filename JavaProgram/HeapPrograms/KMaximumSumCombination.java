package JavaProgram.HeapPrograms;

/*
 * Problem Statement :- Print the maximum K valid sum combinations from all the possible sum combinations from adding the arrays A and B. 
 */
import java.util.*;
public class KMaximumSumCombination {
	static void maxsumcombination(int [] A,int [] B,int k) {
		int n=A.length;
		
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
		// add the all sum to queue
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				pq.add(A[i]+B[j]);
			}
		}
		
		int sum=0;
		
		// condition 
		
		while(sum<k) {
			System.out.print(pq.peek()+" ");
			pq.remove();
			sum++;
		}
		
		
	}

	public static void main(String[] args) {
		int [] A= {3,2};
		int [] B= {1,4};
		int k=2;
		System.out.println("Max Sum Combinations are : ");
		// Function call
		maxsumcombination(A,B,k);
	}

}
