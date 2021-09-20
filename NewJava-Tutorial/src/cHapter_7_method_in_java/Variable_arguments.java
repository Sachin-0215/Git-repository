package cHapter_7_method_in_java;

public class Variable_arguments {
//	static int add(int a,int b)
//	{
//		return a+b;
//	}
//	static int add(int a,int b,int c)
//	{
//		return a+b+c;
//	}
//	static int add(int a,int b,int c,int d)
//	{
//		return a+b+c+d;
//	}
	
	static int add(int x,int ...arr)
	{
		//Available as int [] arr;
		int result=x;
		for(int a:arr)
		{
			result+=a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my World");
		System.out.println("The sum of nothing is : "+add(1));
		System.out.println("The sum of 4 and 290 is : "+add(1,4,290));
		System.out.println("The sum of 400 ,300 and 290 is : "+add(400,300,290));
		System.out.println("The sum of 400 ,300, 290 and 500 is : "+add(400,300,290,500));
		System.out.println("The sum of 400 ,300, 290 , 600 and 500 is : "+add(400,300,290,500,600));
		
	}

}
