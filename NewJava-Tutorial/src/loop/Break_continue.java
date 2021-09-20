package loop;

public class Break_continue {

	public static void main(String[] args) {
		// Break and continue using loops
		// For loop
//		for(int i=0;i<5;i++)
//		{
//			if(i==2)
//			{
//				System.out.println("Ending the loop");
//				//break;
//				continue;
//			}
//			System.out.println(i);
//			System.out.println("Java is Great");
//		}
//		System.out.println("Loop end here");
		
		// While loop
		int i=0;
		while(i<5)
		{
			i++;	
			if(i==2)
			{
				System.out.println("Ending the loop");
				//break;
				continue;
			}
			System.out.println(i);
			System.out.println("Java is Great");
		}
//			System.out.println("Loop ends here");
	}	
		
}
