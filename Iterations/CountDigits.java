package Iterations;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		n=sc.nextInt();
		
		int b= n;
		while(n!=0)
		{
			d++;
			n/=10;
		}
		
		System.out.println("Number of Digits in "+b+" is "+d);
		sc.close();
	}

}
