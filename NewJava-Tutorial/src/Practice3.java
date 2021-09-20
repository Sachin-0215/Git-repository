import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// WAP to which asks the user to enter his/her name and greets them with "Hello "<name>, Have a good day text.
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your Name : ");
		String str = sc.nextLine();
		System.out.println("Hello,"+str+",Have a Good Day");
		sc.close();
	}

}
