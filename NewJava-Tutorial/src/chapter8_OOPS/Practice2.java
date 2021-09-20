package chapter8_OOPS;

class Cellphone{
	public void ring() {
		System.out.println("Ringing....");
	}
	public void vibrate() {
		System.out.println("Vibrating....");
	}
	public void callingfriends() {
		System.out.println("Calling Piyush....");
	}
}

public class Practice2 {

	public static void main(String[] args) {
		// Problem 2:
		Cellphone realmi = new Cellphone();
		realmi.callingfriends();
		realmi.vibrate();
		realmi.ring();

	}

}
