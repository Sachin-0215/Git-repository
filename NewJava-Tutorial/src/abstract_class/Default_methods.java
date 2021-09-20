package abstract_class;

interface camera{
	void takeSnap();
	void recordVideo();
	private void greet() {
		System.out.println("Good Morning");
	}
	default void record4k() {
		greet();
		System.out.println("Recoding in 4k");
	}
}

interface wifi{
	String[] getNetwork();
	void connectNetwork(String network);
}

class Cellphone{
	void callingNumber(int phoneNo) {
		System.out.println("Calling "+phoneNo);
	}
	void pickcall() {
		System.out.println("Connecting... ");
	}
}

class Smartphone extends Cellphone implements wifi,camera{
	public void takeSnap() {
		System.out.println("Taking Snapshot ");
	}
	@Override
	public void recordVideo() {
		// TODO Auto-generated method stub
		
	}
//	public void record4k() {
//		System.out.println("Recording Start in 4k");
//	}
	public String[] getNetwork() {
		System.out.println("Getting list of Network");
		String[] networkList = {"BSNL","JIO","AIRTEL"};
		return networkList;
	}
	public void connectNetwork(String network) {
		System.out.println("Connecting to " + network);
	}
}

public class Default_methods {

	public static void main(String[] args) {
		Smartphone realmi_7i = new Smartphone();
		realmi_7i.record4k();
//		realmi_7i.greet();--> error!
		String[] arr = realmi_7i.getNetwork();
		for(String item:arr)
			System.out.println(item);

	}

}
