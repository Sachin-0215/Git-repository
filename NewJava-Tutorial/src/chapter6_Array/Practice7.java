package chapter6_Array;

public class Practice7 {
	
	public static void main(String[] args) {
		// Problem 7: To find minimum element
//		int [] arr = {212,213,274,255,226};
//		int min = Integer.MAX_VALUE;
//		for(int e:arr)
//			if(e<min)
//				min = e;
//		System.out.println(min);
		
		// Problem 8: To find element is sorted or not 
		 boolean isSorted = true;
	        int [] arr = {1, 2, 3, 4, 5, 34, 67};
	        for(int i=0;i<arr.length-1;i++){
	            if(arr[i] > arr[i+1]){
	                isSorted = false;
	                break;
	            }
	        }
	        if(isSorted){
	            System.out.println("The Array is sorted");
	        }
	        else{
	            System.out.println("The Array is not sorted");
	        }
	}
}
