package Iterations;


public class Pattern2_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,k=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++) 
			{
				System.out.print(k%2);
				//++k;
				k++;
				//flag= ~flag;
				//System.out.print((flag*-1));	
			}
			System.out.println();
		}
	}

}
