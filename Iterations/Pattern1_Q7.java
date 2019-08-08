package Iterations;

import java.util.Scanner;

public class Pattern1_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++){
					for(int j=1;j<=i;j++)	
							System.out.print("*");
						System.out.println();
					sc.close();
		}
	}

}
