package cHapter_7_method_in_java;

public class Rec_Pattern {
	static void pattern(int n)
	{
		if(n>0) {
			pattern(n-1);
			for(int i=0;i<n;i++)
				System.out.print("* ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(8);

	}

}
