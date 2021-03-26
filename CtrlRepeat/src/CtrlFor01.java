import java.util.Scanner;

public class CtrlFor01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int n= sc.nextInt();
		
		
		for(int i=0; i<=n;i++) {
			System.out.println(i);
		}
	}

}
