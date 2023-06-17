package JavaProgram.SortingAlgorithms;

/*
 * Program for insertion sort.
 */

public class InsertionSort {
	
	static void insertionsort(int arr[]) {
		
		int n=arr.length;
		
		for (int i = 0; i <= n - 1; i++) {
			
			for(int j=i;j>0;j--) {
				// condition 
				if(arr[j-1]>arr[j]) {
					// swap the elements
					int temp = arr[j - 1];
	                arr[j - 1] = arr[j];
	                arr[j] = temp;
	                
				}
			}
        }
		System.out.println("The array after the  insertion sort : ");
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int nums[]= {2,3,1,4,6,8,5,10,7,9};
		
		System.out.println("The array before the  insertion sort : ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		// insertion sort
		insertionsort(nums);
		

	}


}
