package Iterations;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,a,r=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		no=sc.nextInt();
		
		temp=no;
		
	/*	while(i<=100)
		{	
			no=i;
			r=0;
			while(no>=1)
			{
				a=no%10;
				r=r*10+a;
				no=no/10;
			}
			if(i==r)
			System.out.println(r);
			i++;
		}*/
		
		r=0;
		while(no>=1)
		{
			a=no%10;
			r=r*10+a;
			no=no/10;
		}
		
		if(no==r)
		System.out.println(r);
		System.out.println("Reverse no = "+r);
		
		if(temp==r){
			System.out.println("Ginen number is pallindrome");
		}else{
			System.out.println("Ginen number is not pallindrome");
		}
	
sc.close();

	}

}
