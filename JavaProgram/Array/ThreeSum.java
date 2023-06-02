package JavaProgram.Array;

/* Problem Statement: Given an array of N integers, our task is to find unique triplets(sum of three elements)
			that add up to give a sum of zero */

import java.util.*;
public class ThreeSum {
	static ArrayList<ArrayList<Integer>>threesum(int arr[]){
		ArrayList<ArrayList<Integer>>list=new ArrayList<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					ArrayList<Integer>temp=new ArrayList <>();
					if(arr[i]+arr[j]+arr[k]==0) {
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
					}
					if(temp.size()!=0) {
						list.add(temp);
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		 int arr[]={-1,0,1,2,-1,-4,3,-3,-7,2};
		ArrayList<ArrayList<Integer>>result=threesum(arr);
		 System.out.println("The triplets sum elements are as follows: ");
		 for(int i=0;i<result.size();i++) {
			 for(int j=0;j<result.get(i).size();j++) {
				 System.out.print(result.get(i).get(j)+" ");
			 }
			 System.out.println();
		 }
	}
}
