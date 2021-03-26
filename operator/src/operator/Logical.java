package operator;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		boolean a,b;

		System.out.println("첫 번쨰 논리값(true or false) : ");
		a = sc.nextBoolean();
		System.out.println("첫 번쨰 논리값(true or false) : ");
		b = sc.nextBoolean();

		System.out.println("!"+a+"="+b+(!a));
		System.out.println(a+"&&"+b+"="+(a && b));
		System.out.println(a+"^"+b+"="+(a ^ b));
		System.out.println(a+"||"+b+"="+(a || b));
		
		sc.close();
		
	}

}
