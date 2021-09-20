package polymorphism;

interface Mycamera{
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

interface Wifi{
	String[] getNetwork();
	void connectNetwork(String network);
}

class cellphone{
	void callingNumber(int phoneNo) {
		System.out.println("Calling "+phoneNo);
	}
	void pickcall() {
		System.out.println("Connecting... ");
	}
}

class smartphone extends cellphone implements Wifi,Mycamera{
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
	public void met() {
		System.out.println("Method");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Mycamera cam1 = new smartphone(); //This is a smartphone but use it as a camera
//		cam1.getNetwork(); Not allowed 
//		cam1.met();Not allowed
		cam1.record4k();
		
		smartphone realmi = new smartphone();
		realmi.callingNumber(0111);
		realmi.pickcall();
		realmi.takeSnap();
		realmi.connectNetwork("JIO");

	}

}

