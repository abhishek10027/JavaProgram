package JavaProgram.SortingAlgorithms;

/*
 * Program for bubble sort algorithm.
 */

public class BubbleSort {
	
	static void bubblesort(int arr[]) {
		int n=arr.length;
		
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				// condition
				if(arr[j]>arr[j+1]) {
					// swap the elements
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("The array after the  bubble sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int nums[]= {2,3,1,4,6,8,5,7};
		
		System.out.println("The array before the  bubble sort : ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		// Bubble sort
		bubblesort(nums);
		

	}

}
