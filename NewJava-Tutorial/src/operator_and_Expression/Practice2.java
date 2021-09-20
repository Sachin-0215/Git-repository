package operator_and_Expression;

public class Practice2 {

	public static void main(String[] args) {
//		WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
	
		System.out.println("Enter Your Grade : ");
		char grade = 'A';
		char grades = (char)(grade+8);
		System.out.println(grades);
		
		// Decrypt the grade
		grade = (char)(grades-8);
		System.out.println(grade);
		
		
	}

}
