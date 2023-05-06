package JavaProgram.Array;

import java.util.Scanner;

public class FindIndex {
	static void find(int arr[],int k) {
		boolean flag=false ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("element position is :"+i);
				flag=true;
				break;
				
			}
			
			}
		if(flag==false) {
			System.out.println("element not fount");
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements for the array");
		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the find element of the array:");
		int k=sc.nextInt();
		find(arr,k);

	}

}
