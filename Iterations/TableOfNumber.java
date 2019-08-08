package Iterations;


import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		System.out.println("The table for "+n+" is ");
		for(int i=1;i<=10;i++)
		{
			t=n*i;
			System.out.println(n+"  *   "+i+"  =   "+t);
		}
		sc.close();
	}

}
