package Iterations;

import java.util.Scanner;

public class FibonacCiseries {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		  int f1 = 0, f2 = 1, i; 
	      
	        if (n < 1) 
	            return; 
	      
	        for (i = 1; i <= n; i++) 
	        { 
	            System.out.print(f2+" "); 
	            int next = f1 + f2; 
	            f1 = f2; 
	            f2 = next; 
	        } 

	}

}
