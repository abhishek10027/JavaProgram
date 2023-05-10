package JavaProgram.Array;

public class SecondLargestElement {
	static int secondlargest(int arr[],int n) {
		int largest=arr[0];
		int slargest=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				
				slargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]<largest&&arr[i]>slargest) {
				slargest=largest;
			}
		}
		return slargest;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		System.out.println("The second largest number is:"+secondlargest(arr,n));

	}

}
