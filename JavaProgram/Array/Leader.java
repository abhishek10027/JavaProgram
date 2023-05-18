package JavaProgram.Array;

public class Leader {
	public static void findleader(int [] arr) {
		int n=arr.length;
		int max=Integer.MIN_VALUE;//iterate the array from right to left
		for (int i=n-1;i>=0;i--) {
			if(arr[i]>max) {
				// if the current elements is greater then the max ,it is a leader
				System.out.print(arr[i]+" ");
				max=arr[i];
				
			}
		}
	}
	public static void main(String args[]) {
		int [] arr= {12,5,12,10,12,10,4,8,7,8,1};
		findleader(arr);
	}
}
