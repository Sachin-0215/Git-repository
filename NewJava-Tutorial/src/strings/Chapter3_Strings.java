package strings;
import java.util.Scanner;

public class Chapter3_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str = new String("Sachin");
		// String str = "Sachin";
		// System.out.println("Your name is : "+str);
		// int a=8;float b=9.2f;
		// System.out.printf("The value of a is %d and value of b is %f", a,b);
		// System.out.format("\nThe value is %d %f", a,b);
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf("%s",str);
		sc.close();
		
	}

}
