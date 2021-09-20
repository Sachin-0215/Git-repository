package operator_and_Expression;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean c = a>b;
		System.out.println(c);
		sc.close();
	}
}
