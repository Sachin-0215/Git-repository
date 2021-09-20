package conditionalStatement;
import java.util.Scanner;

public class Practice6 {
	public static void main(String args[])
	{
		System.out.println("Enter Websites");
		Scanner sc = new Scanner(System.in);
		String websites = sc.nextLine();
		if(websites.endsWith(".org"))
			System.out.println("Organisational Websites");
		else if(websites.endsWith(".com"))
			System.out.println("Commercial Websites");
		else if(websites.endsWith(".in"))
			System.out.println("Indian Websites");
		
		sc.close();
	}

}
