import java.util.Scanner;

public class VariableArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a0,a1,a2,a3,a4,a5,a6,a7,a8,a9;
		int max = -2147483648, min = 2147483647, sum = 0;
		a0 = sc.nextInt(); a1 = sc.nextInt();
		a2 = sc.nextInt(); a3 = sc.nextInt();
		a4 = sc.nextInt(); a5 = sc.nextInt();
		a6 = sc.nextInt(); a7 = sc.nextInt();
		a8 = sc.nextInt(); a9 = sc.nextInt();
		sum = a0+a2+a3+a4+a5+a6+a7+a8+a9;
		if(a0 > max) max = a0; if(a1>max) max = a1; if(a2 > max) max = a2;
		if(a3 > max) max = a3; if(a4>max) max = a4; if(a5 > max) max = a5;
		if(a6 > max) max = a6; if(a7>max) max = a7; if(a8 > max) max = a8;
		if(a9 > max) max = a9;
		if(a0 < min) min = a0; if(a1 < min) min = a1; if(a2 < min) min = a2;
		if(a3 < min) min = a3; if(a4 < min) min = a4; if(a5 < min) min = a5;
		if(a6 < min) min = a6; if(a7 < min) min = a7; if(a8 < min) min = a8;
		if(a9 < min) min = a9;
		System.out.println("ĂÖ´ë°Ş : "+max);
		System.out.println("ĂÖźŇ°Ş : "+min);
		System.out.println("ĆňąŐ : "+((double)sum/10));
		sc.close();

	}

}