package JavaProgram.HeapPrograms;

/*
 * Problem statement:- for given an sorted array arr[] and two numbers X and K, our task is to find K closest values to X in arr[].
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KClosestElements {

	static ArrayList <Integer> kclosestelements(int arr[], int k,int x)
    {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        int left=0;
        int right=arr.length-k;
        while(left<right) {
        	int mid=(left+right)/2;
        	if(x-arr[mid]>arr[mid+k]-x)
        		left=mid+1;
        	else
        		right=mid;
        }
        for(int i=left;i<left+k;i++) {
        	pq.add(arr[i]);
        }
        ArrayList <Integer> ar=new ArrayList<>(pq);	
        return ar;
    }
	public static void main(String[] args) {
		int arr[] = {1, 2,3,4,5}  ;
		int k=4;
		int x=3;
		 ArrayList <Integer> ar=kclosestelements(arr,k,x);
		 
		 for(int i=0;i<ar.size();i++) {
			 System.out.print(ar.get(i)+" ");
		 }
		 System.out.println();
	}
}


