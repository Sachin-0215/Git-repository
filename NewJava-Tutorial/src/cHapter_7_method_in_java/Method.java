package cHapter_7_method_in_java;

public class Method {
	static void change(int a)
	{
		a=100;
	}
	static void change2(int [] arr)
	{
		arr[0]=98;
	}
	static void wishes()
	{
		System.out.println("Good Morning Sir");
		
	}

	public static void main(String[] args) {
//		wishes();
		// Case 1:Changing the integer
		int x=20;
		change(x);
		System.out.println("The value of x after running change is : "+x);
		
		//Case 2:Changing the array
		int [] marks = {52,77,88,55,66};
		change2(marks);
		System.out.println("The value of marks after running change is : "+marks[0]);
		

	}

}
