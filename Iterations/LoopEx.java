package Iterations;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=100){
			System.out.print(" "+i);
			i++;
		}
		System.out.println();
		for(int j=1;j<=100;j++){
			System.out.print(" "+j);
		}
		System.out.println();
		int k=0;
		do{
			k++;
			System.out.print(" "+k);
		}while(k<=100);
	}

}
