package games;
import java.util.Scanner;
import java.util.Random;

class game{
	public int number;
	public int inputnumber;
	public int noOfGuesses=0;
	
	public int getNoofGuesses() {
		return noOfGuesses;
	}
	public void setNoofGuesses(int nog) {
		this.noOfGuesses = nog;
	}
	game(){
		System.out.println("Guess the Number");
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	void takeUserInput() {
		Scanner cs  = new Scanner(System.in);
		inputnumber = cs.nextInt();
		cs.close();
	}
	boolean isCorrectNumber() {
		noOfGuesses++;
		if(inputnumber==number)
			System.out.printf("Yes you guessed it right, it was %d, you guessed %d times",number,noOfGuesses);
		else if(inputnumber<number)
			System.out.println("Too low...");
		else if(inputnumber>number)
			System.out.println("Too high...");
		return false;
	}
	
}

public class Guessing_the_Number {

	public static void main(String[] args) {
		game g = new game();
		boolean b=false;
		while(!b)
		{
			g.takeUserInput();
			b = g.isCorrectNumber();
		}
	}

}
