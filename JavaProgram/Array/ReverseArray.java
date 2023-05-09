package JavaProgram.Array;
import java.util.Arrays;
public class ReverseArray {
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void reverse(int arr[]) {
		
		int start =0;
		int end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start ++;
			end --;
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		System.out.println("Before reverse opearation :"+Arrays.toString(arr));
		reverse(arr);
		System.out.println("\nAfter reverse operartion :"+Arrays.toString(arr));
		
		

	}

}
