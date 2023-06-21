package JavaProgram.HeapPrograms;

/*
 * Problem Statement :- Given an integer array nums and an integer k, return the k most frequent elements.
 */

import java.util.*;
public class KmostFrequentElements {
	
	public static ArrayList<Integer> mostfrequentelements(int [] nums,int k) {
		if(nums.length==0)
			return new ArrayList<Integer>();
		
		Map<Integer,Integer>map=new HashMap();
		
		// put the all elements in the Hashmap
		for(int num:nums) {
			map.put(num,map.getOrDefault(num,0)+1);
		}
		
		
		PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
		// Add the elements in the Queue
		for(int n:map.keySet()) {
			pq.add(n);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		// Array list for result
		ArrayList<Integer> result = new ArrayList<>();
        
        while (!pq.isEmpty()) {
            int num = pq.poll();
            result.add(num);
        }
        
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,3,3,2,2,4};
		int k=3;
		ArrayList<Integer>res=mostfrequentelements(arr,k);
		Collections.sort(res);
		System.out.print("The most frequent elements are: " +res);

	}

}
