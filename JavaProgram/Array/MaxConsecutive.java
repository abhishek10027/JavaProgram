package JavaProgram.Array;

public class MaxConsecutive {
	public static int findconsecutive(int arr[]) {
		int max=0;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				max=Math.max(max,count);
			}
			else {
				count=0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,5,6,7,1,1,1,1};
		System.out.println("the max consecutive onces is : "+findconsecutive(arr));
	}

}
