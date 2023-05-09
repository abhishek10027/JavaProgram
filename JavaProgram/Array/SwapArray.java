package JavaProgram.Array;
import java.util.Scanner;
import java.util.Arrays;

public class SwapArray {
	static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void main(String ars[]) {
		System.out.println("enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Arrays before swap:"+Arrays.toString(arr));
		swap(arr,2,3);
		System.out.println("\nArrays after swap:"+Arrays.toString(arr));
		
		
		
	}

}
