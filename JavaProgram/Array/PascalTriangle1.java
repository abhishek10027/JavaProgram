package JavaProgram.Array;

import java.util.Scanner;

//Variation 1: Print the element at position (r, c) in Pascal’s triangle if row number r and column number c are given

public class PascalTriangle1 {
	// this is for NCR formula
	static long ncr(int n,int r) {
		long result=1;
		for(int i=0;i<r;i++) {
			result=result*(n-i);
			result=result/(i+1);
		}
		return result;
	}
	
	// it will print the element in given conditions  
	
	static int printelement(int r,int c) {
		int element =(int) ncr(r-1,c-1);
		return element;
	}
	

	public static void main(String[] args) {
		System.out.print("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.print("\nEnter the number of columns:");
		int c=sc.nextInt();
		int ans =printelement(r,c);
		System.out.print("\nThe element is : "+ans);
	}

}
