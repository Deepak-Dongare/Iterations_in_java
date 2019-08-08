package Iterations;
public class DisplayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=407;
		
		System.out.println("The Numbers Ending with 7 between 400 and 500 are");
		while(n<=497)
		{
			if((n%10)==7)
			{
				System.out.print(n+" ");
			}
			++n;
		}
	}

}
