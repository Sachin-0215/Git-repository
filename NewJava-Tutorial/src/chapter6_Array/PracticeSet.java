package chapter6_Array;

public class PracticeSet {

	public static void main(String[] args) {
		// Problem 1:
		/*float [] array =  {5.6f,8.6f,2.2f,6.2f,4.7f};
		float sum = 0.0f;
//		for(int i=0;i<array.length;i++)
//		{
//			sum+=array[i];
//		}
//		System.out.print(sum);
		
		other method
		for(float element:array)
			sum+=element;
		System.out.println(sum);
		*/
		
		//Problem 2:
		/*float [] array =  {5.6f,8.6f,2.2f,6.2f,4.7f};
		float num=4.2f;
		boolean isAnArray = false;
		for(float element:array)
		{
			if(num==element)
				isAnArray = true;
				break;
		}
		if(isAnArray==true)
			System.out.println("Present : "+num);
		else
			System.out.println("Not Present");
		*/
		
		// Problem 3:
				float [] array =  {5.6f,8.6f,2.2f,6.2f,4.7f};
				float sum = 0.0f,avg=0.0f;
				for(int i=0;i<array.length;i++)
				{
					sum+=array[i];
				}
				avg=sum/array.length;
				System.out.print(avg);
	}

}
