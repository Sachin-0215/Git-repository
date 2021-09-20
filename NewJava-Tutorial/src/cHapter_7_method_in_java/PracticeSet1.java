package cHapter_7_method_in_java;

public class PracticeSet1 {
	//Problem 1:
//	static void multiplication(int n)
//	{
//		for(int i=1;i<=10;i++)
//			System.out.printf("\n%d x %d = %d", n,i,n*i);
//	}
	//Problem 2:
	static void pattern(int m)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("x ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a=5;
//		multiplication(a);
		pattern(6);
		

	}

}
