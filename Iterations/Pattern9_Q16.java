package Iterations;


public class Pattern9_Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			int flag=0;
			
			for(int j=1;j<=i;j++){
				flag=~flag;
				System.out.print((flag*-1)+" ");
			}
			System.out.println();
		}
		
	}

}
