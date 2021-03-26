package operator;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("첫 번째 정수 : ");
		a= sc.nextInt();
		System.out.println("두 번째 정수 : ");
		b= sc.nextInt();
		
		
		
		System.out.printf("(%d < %d)?1:2 => %d",a,b,((a<b)?1:2));
		//삼항 연산자 ?: => (조건식)?true:false
		
		
		
		
		
		sc.close();
	}

}
