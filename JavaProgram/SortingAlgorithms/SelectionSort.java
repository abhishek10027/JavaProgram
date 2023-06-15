package JavaProgram.SortingAlgorithms;

/*
 * Problem statement :- Write the code for implementation the selection sort.
 */

public class SelectionSort {
	
	static void selectionsort(int arr[]) {
		int n=arr.length;
		//find minimum element of the array
		for(int i=0;i<n-1;i++) {
			int min=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			// swap the elements
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		
		System.out.println("After the selection sort the array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int nums[]= {2,3,4,12,5,1};
		int n=nums.length;
		
		System.out.println("Before the selection sort the array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		// selection sort 
		selectionsort(nums);

	}

}
