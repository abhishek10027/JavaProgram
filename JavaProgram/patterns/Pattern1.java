package JavaProgram.patterns;

import java.util.Scanner;

public class Pattern1 {
	
	public static void print(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		System.out.print("enter the size for the square pattern:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		
	}

}
