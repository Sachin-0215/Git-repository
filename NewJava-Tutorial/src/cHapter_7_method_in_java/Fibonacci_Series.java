package cHapter_7_method_in_java;

public class Fibonacci_Series {
	static int fibo(int n)
	{
		/*
		if(n==1) {return 0;}
		else if(n==2) {return 1;}
		*/
		if(n==1 || n==2) {return n-1;}
		else {return fibo(n-2) + fibo(n-1);}
	}
	public static void main(String[] args) {
		System.out.println(fibo(7));

	}

}
