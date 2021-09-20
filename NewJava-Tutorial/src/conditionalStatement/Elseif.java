package conditionalStatement;
import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {		        
		        int age;
		        System.out.println("Enter Your Age");
		        Scanner sc = new Scanner(System.in);
		        age = sc.nextInt();
		        if (age>56){
		            System.out.println("You are experienced!");
		        }
		        else if(age>46){
		            System.out.println("You are semi-experienced!");
		        }
		        else if(age>36){
		            System.out.println("You are semi-semi-experienced!");
		        }
		        else{
		            System.out.println("You are not experienced");
		        }
		        
		        sc.close();
	}

}
