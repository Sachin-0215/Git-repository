package games;

import java.util.Scanner;
import java.util.Random;

public class R_P_S {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**************** Rules ********************");
		System.out.println("#Press 0 For Rock");
		System.out.println("#Press 1 For Paper");
		System.out.println("#Press 2 For Scissor");
		System.out.println("*******************************************");
		int userInput = sc.nextInt();
		
		Random random = new Random();
		int computerInput = random.nextInt(3);
		
		if(userInput==computerInput) {
			System.out.println("Draw");
		}
		else if(userInput == 0 && computerInput ==2 || userInput == 1 && computerInput == 0
				|| userInput == 2 && computerInput == 2) {
			System.out.println("You Win!!!");
		}
		else {
			System.out.println("Computer Win!");
		}
		if(computerInput==0)
			System.out.println("Computer's Choice: Rock");
		else if(computerInput==1)
			System.out.println("Computer's Choice: Paper");
		else
			System.out.println("Computer's Choice: Scissor");
	}

}
