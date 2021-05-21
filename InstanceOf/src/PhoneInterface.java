
public interface PhoneInterface {
	final int TIEMOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
