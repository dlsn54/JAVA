import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		int sum=0,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력하세요");
		for(int i=1;i<=3;i++) {
			System.out.print(i+">>");
			
			try {
				n=sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("정수를 입력하세요");
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("합은 "+sum);
	}

}
