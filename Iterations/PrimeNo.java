package Iterations;


import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no;
		boolean prime = true;

		for (int j = 1; j <= 100; j++) {
			prime = true;
			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					prime = false;
					// System.out.println(no +" is not prime number");
					// System.exit(0);
				}
			}
			if (prime)
				System.out.print(j + " ");

		}
	}
}

/*
 * int num; boolean flag = false; Scanner sc=new Scanner(System.in);
 * System.out.println("Enter the number"); num=sc.nextInt(); for(int i = 2; i <=
 * num/2; ++i) { // condition for nonprime number if(num % i == 0) { flag =
 * true; break; } }
 * 
 * if (!flag) System.out.println(num + " is a prime number."); else
 * System.out.println(num + " is not a prime number."); sc.close();
 */

/*
 * enter choice; switch(choice){ case 1: System.out.println("Even numbers are");
 * for(int i=1;i<=100;i++){ if(i%2==0) System.out.print(i+" "); } break; case 2:
 * System.out.println("Odd numbers are"); for(int i=1;i<=100;i++){ if(i%2!=0)
 * System.out.print(i+" "); } break; case 3:
 * System.out.println("Prime numbers are"); break;
 * 
 * }
 */
