package operator_and_Expression;

public class Associativity_of_optr {

	public static void main(String[] args) {
		        // Precedence & Associativity

		        int a = 6*5-34/2;
		        /*
		        Highest precedence goes to * and /. They are then evaluated on the basis
		        of left to right associativity
		            =30-34/2
		            =30-17
		            =13
		         */
		        int b = 60/5-34*2;
		        /*
		            = 12-34*2
		            =12-68
		            =-56
		         */

		        System.out.println(a);
		        System.out.println(b);

		        // Quick Quiz
		        int x =6;
		        int y = 1;
		        int k1 = x * y/2;
		        System.out.println(k1);

		        int b1 = 0;
		        int c = 0;
		        int a1 = 10;
		        int k = (b1*b1)- (4*a1*c)/(2*a1);
		        System.out.println(k);

	}
}

