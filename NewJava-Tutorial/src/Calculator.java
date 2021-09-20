import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Program for CBSE BOARD Calculator
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter Your 5 subjects Marks : ");
		float Maths = marks.nextFloat();
		float Chem = marks.nextFloat();
		float Physics = marks.nextFloat();
		float Hindi = marks.nextFloat();
		float English = marks.nextFloat();
		float total = (Maths+Chem+Physics+Hindi+English);
		float Percentage = (total/500)*100;
		System.out.println("Your Percentage is : "+Percentage+"%");
		marks.close();
	}

}
