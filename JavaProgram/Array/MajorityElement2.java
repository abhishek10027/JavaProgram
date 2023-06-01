package JavaProgram.Array;

/*Problem Statement:Find the elements that are appear more than N/3 times in the array. 
				If elements does not exist, then return an empty vector.*/

import java.util.*;

public class MajorityElement2 {
	public static List<Integer>majorityelement(int arr[]){
		int n=arr.length;
		List<Integer>list=new ArrayList<>();
		
		HashMap<Integer,Integer>hmap=new HashMap<>();
		
		// it is a majority elements condition 
		int condition=(int)(n/3)+1;
		
		for(int i=0;i<n;i++) {
			int count=hmap.getOrDefault(arr[i],0);
			hmap.put(arr[i],count+1);
			if(hmap.get(arr[i])==condition) {
				list.add(arr[i]);
			}
			if(list.size()==2) break;
			
		}
		return list;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,1,1,2,2};
		List<Integer>ls=majorityelement(arr);
		System.out.println("Majority elements are :");
		for(int i=0;i<ls.size();i++) {
			System.out.print(ls.get(i)+" ");
		}
		System.out.println();
	}

}
