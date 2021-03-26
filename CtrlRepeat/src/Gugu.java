import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Á¤¼ö : ");
		j=sc.nextInt();
		
		for(i=1;i<=9;i++) {
			System.out.println(j+"x"+i+"="+(i*j));
		}
	}

}
