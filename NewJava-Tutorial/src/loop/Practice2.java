package loop;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		// Problem 2: Sum of n even natural number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		int sum=0,i=0;
		while(i<n)
		{
			sum+=(2*i);
			i++;
		}
		System.out.printf("Sum of %d Natural Number is : ",n);
		System.out.print(sum);
		sc.close();
	}

}
