package JavaProgram.patterns;

import java.util.Scanner;

public class LowerTrianglePattern {
	public static void print(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		System.out.println("enter the number for lower triangle:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
	}

}
