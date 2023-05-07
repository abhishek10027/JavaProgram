package JavaProgram.patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void print(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		System.out.print("enter the size for the numbers Triangle pattern:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		
	}

}
