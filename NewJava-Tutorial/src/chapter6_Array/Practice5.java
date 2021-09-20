package chapter6_Array;

public class Practice5 {

	public static void main(String[] args) {
		// Problem 5: Reverse an array
//		for(int i=arr.length-1;i>=0;i--)
//			System.out.println(arr[i]);
		
		int [] arr = {9,8,7,65,4,2,87};
		int n=Math.floorDiv(arr.length, 2);
		int l=arr.length,temp;
//		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			//Swap arr[i] and arr[l-i-1]
			// a  b  temp
			temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		for(int element:arr)
			System.out.print(element+" ");
	}

}
