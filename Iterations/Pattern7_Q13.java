package Iterations;


public class Pattern7_Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		a= ~a;
		for(int i=1;i<=5;i++) 
		{
			if(i%2==1)
				a= ~a;
			
			for(int j=1;j<=i;j++)
			{					
				a= ~a;				
				System.out.print(a*a+" ");
			}		
			System.out.println();
		}
	}

}
