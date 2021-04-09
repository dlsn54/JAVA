package review;

public class doWhileReview {

	public static void main(String[] args) {
		char a='A';
		
		do {
			System.out.print(a);
			a=(char)(a+1);
		}
		while(a<='Z');
	}
}