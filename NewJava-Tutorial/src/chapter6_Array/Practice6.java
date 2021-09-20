package chapter6_Array;

public class Practice6 {

	public static void main(String[] args) {
		// Problem 6: To find max element in an array
		int [] arr = {1200,9,5,118,36};
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Maximum element in an array is : "+max);

	}

}
