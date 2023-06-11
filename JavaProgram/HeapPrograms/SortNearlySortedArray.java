package JavaProgram.HeapPrograms;

/*
 * Given an array of n elements, where each element is at most k away from its target position, we have to sort the array optimally.
 */

import java.util.*;
public class SortNearlySortedArray {
	static ArrayList <Integer> nearlySorted(int arr[], int k)
    {
        ArrayList <Integer> ar=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }
        for(int i=k+1;i<arr.length;i++){
            ar.add(pq.remove());
            pq.add(arr[i]);
        }
        while(pq.size()>0){
            ar.add(pq.remove());
        }
        return ar;
    }
	public static void main(String[] args) {
		int arr[] = {1, 2,6, 4, 5,3}  ;
		int k=2;
		 ArrayList <Integer> ar=nearlySorted(arr,k);
		 
		 for(int i=0;i<ar.size();i++) {
			 System.out.print(ar.get(i)+" ");
		 }
		 System.out.println();
	}

}
