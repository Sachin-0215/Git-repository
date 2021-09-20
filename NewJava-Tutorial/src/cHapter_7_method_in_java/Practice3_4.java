package cHapter_7_method_in_java;

public class Practice3_4 {
	//Problem 3: recursive function of sum of n natural numbers
//	static int sumRecur(int n)
//	{
//		if(n==1) {return 1;}
//		else { return n + sumRecur(n-1);}
//	}
	
	//Problem 4: reverse pattern
	static void pattern(int m)
	{
		for(int i=0;i<m;i++)
			for(int j=0;j<i+1;j++)
				System.out.print("x ");
			System.out.println("");
	}
	public static void main(String[] args) {
//		System.out.print(sumRecur(4));
		pattern(4);

	}

}
