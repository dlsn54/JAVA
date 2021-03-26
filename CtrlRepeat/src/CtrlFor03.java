

import java.util.Scanner;

public class CtrlFor03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Á¤¼ö : ");
		n= sc.nextInt();
		
		int i,sum=0;
		
		for(i=1;i<=n;i++) {
			sum+=i;
			
			System.out.print(i);
			if(i<=n-1)
				System.out.print("+");
			else
				System.out.print("=");
		}
		System.out.println(sum);
		System.out.println(i);
	}

}
