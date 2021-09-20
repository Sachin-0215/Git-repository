package loop;

public class Star_Pattern {

	public static void main(String[] args) {
		// Problem 1:
		for(int i=5;i!=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		
		
		// Practice 8:
		int n=8,sum=0,i;
		for(i=1;i<=10;i++)
			sum+=(n*i);
		System.out.println(sum);
	}

}
