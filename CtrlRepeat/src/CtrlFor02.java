import java.util.Scanner;

public class CtrlFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int n=sc.nextInt();
		
		int i,hap=0;
		//break point
		for(i=0;i<=n;i++) {
			hap+=i; //hap=hap+i;
		}
		System.out.println("0부터 "+n+"까지의 합 = "+hap+"입니다");
		
		sc.close();
	}

}
