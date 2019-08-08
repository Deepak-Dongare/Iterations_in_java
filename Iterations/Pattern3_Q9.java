package Iterations;


public class Pattern3_Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=7;
				
	/*	for(int i=no;i>=1;i--){
			for(int j=65;j<=65+i-1;j++){
				System.out.print((char)j);
				}
		System.out.println();
		}*/
		
		for(int i=1;i<=no;i++){
			for(int j=65;j<=65+i-1;j++){
				System.out.print((char)j+" ");
				}
		System.out.println();
		}
		
		
	}

}
