import java.util.Scanner;
public class Input_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking Input From the User");
		Scanner Input = new Scanner(System.in);
//		System.out.println("Enter first Number : ");
////		int a = Input.nextInt();
//		float f1=Input.nextFloat();
//		System.out.println("Enter second Number : ");
////		int b = Input.nextInt();
//		float f2 = Input.nextFloat();
////		int sum=a+b;
//		float sum = f1+f2;
////		System.out.println("Sum of "+a+" and "+b+" is : ");
//		System.out.print("Sum of "+f1+" and "+f2+" is : ");
//		System.out.print(sum);
		
//		boolean b1 = Input.hasNextInt();
//		System.out.println(b1);
//		String str = Input.next();
		String str2 = Input.nextLine();
		System.out.println(str2);
		Input.close();
	}

}
