class Calcu{
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SamsumPhone extends Calcu implements PhoneInterface{
	public void sendCall() {
		System.out.println("��������");
	}
	public void receiveCall() {
		System.out.println("��������");
	}
	public void flash() {
		System.out.println("��¦ ��¦");
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