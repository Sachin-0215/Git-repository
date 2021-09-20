package conditionalStatement;
import java.util.Scanner;
public class PracticeSet {

	public static void main(String[] args) {
		// Problem 1:
//		int a=10;
//		if(a=11)
//			System.out.println("I'm 11");
//		else
//			System.out.println("I'm not 11"); 
		
		//Problem 2:
		Scanner sc = new Scanner(System.in);
//		byte m1=sc.nextByte();
//		byte m2=sc.nextByte();
//		byte m3=sc.nextByte();
//		float avg=(m1+m2+m3)/3.0f;
//		if (avg>40 && m1>33 && m2>33 && m3>33)
//			System.out.println("Pass");
//		else
//			System.out.println("Fail");
		
//		Problem 4:
		System.out.print("Enter Day : ");
		int day = sc.nextInt();
		switch(day)
		{
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
			
		}
		sc.close();

	}

}
