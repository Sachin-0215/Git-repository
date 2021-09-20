package abstract_class;

interface Bicycle{
	int a=2;
	void applyBrakes(int decrement);
	void speedUp(int increment);
}
interface HornBicycle{
	void Dhoomhorn();
	void AC();
}

class AvonCycle implements Bicycle, HornBicycle{
	void blowHorn() {
		System.out.println("Pee Pee POO POO");
	}
	public void applyBrakes(int decrement)
	{
		System.out.println("Applying Brakes");
	}
	public void speedUp(int increment) {
		System.out.println("Applying SpeedUp");
	}
	public void Dhoomhorn() {
		System.out.println("Dhoom Theme Horn...");
	}
	public void AC() {
		System.out.println("A.C Will be on");
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		AvonCycle ac = new AvonCycle();
		ac.applyBrakes(1);
		ac.blowHorn();
		ac.speedUp(1);
		
		//You can create properties in Interfaces as they are final
//		System.out.println(ac.a);
		//You can't modify the properties in Interfaces  as they are final
		//ac.a = 45;
		
		ac.Dhoomhorn();
		ac.AC();
		
		
	}

}
