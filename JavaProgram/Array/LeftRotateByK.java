package JavaProgram.Array;

public class LeftRotateByK {
	public static void rotate(int arr[],int d) {
		int n=arr.length;
		d=d%n;
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
			
		}
		for(int i=n-d;i<n;i++) {
			arr[i]=temp[i-(n-d)];
			
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6};
		int d=2;
		int n=arr.length;
		System.out.println("Before rotation:");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");
        System.out.println();

        rotate(arr, d);
        System.out.println("After rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
	}

}
