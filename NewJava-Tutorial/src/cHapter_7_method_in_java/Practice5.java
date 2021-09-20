package cHapter_7_method_in_java;

public class Practice5 {

	public static void main(String[] args) {
		// To find the average set of numbers passed as arguments

		static int avg(int ...arr)
		{
			//Available as int [] arr;
			int average=0;
			for(int a:arr)
			{
				average=a;
			}
			return average;
		}

	}

}
