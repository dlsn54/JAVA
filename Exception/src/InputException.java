import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		int sum=0,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3���� ������ �Է��ϼ���");
		for(int i=1;i<=3;i++) {
			System.out.print(i+">>");
			
			try {
				n=sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("������ �Է��ϼ���");
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("���� "+sum);
	}

}
