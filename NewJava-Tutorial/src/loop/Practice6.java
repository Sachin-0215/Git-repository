package loop;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,fact=1,i;
		for(i=1;i<=n;i++)
			fact*=i;
		
		System.out.printf("Factorial of %d is : %d\n\n",n,fact);
		
		
		// Practice 6: Repeat using while loop
		int m=5,Fact=1,j=1;
		while(j<=m)
		{
			Fact*=j;
			j++;
		}	
		System.out.println(Fact);	
		
		
		
	}

}
