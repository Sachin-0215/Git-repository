package cHapter_7_method_in_java;

public class Recursion {

	// Recursive method
	static int factorial(int n)
	{
		if(n==0 || n==1) {return 1;}
		else {return n*factorial(n-1);}
	}
	// Iterative method
	static int Ifact(int m)
	{
		int product = 1;
		if(m==0 || m==1) {return 1;}
		else {
				for(int j=1;j<=m;j++)
							product *= j;
				return product;
		}		
	}
	public static void main(String[] args)
	{
		int a=10;
		System.out.printf("Factorial of %d is : %d",a,factorial(a));
		System.out.printf("\nIterative factorial of %d is : %d", a,Ifact(a));
	}

}
