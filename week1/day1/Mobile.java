package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("Hello");
	}
	public void takeSnapshot() {
		System.out.println("Snapshot Taken");
	}

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.sendSms();
		obj.takeSnapshot();
	}

}
