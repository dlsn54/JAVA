class Calcu{
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SamsumPhone extends Calcu implements PhoneInterface{
	public void sendCall() {
		System.out.println("µû¸£¸£¸ª");
	}
	public void receiveCall() {
		System.out.println("¿©º¸¼¼¿ä");
	}
	public void flash() {
		System.out.println("¹ÝÂ¦ ¹ÝÂ¦");
	}
	
}

public class InterfaceTest{
	public static void main(String[] args) {
		SamsumPhone s =new SamsumPhone();
		s.printLogo();
		s.sendCall();
		s.receiveCall();
		s.flash();
		System.out.println(s.calculate(5, 5));
	}
}