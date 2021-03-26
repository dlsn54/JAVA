import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String name;
		System.out.print("당신의 이름은 : ");
		name =sc.next();
		
		String city;
		System.out.print("당신의 도시은 : ");
		city =sc.next();
		
		int age;
		System.out.print("당신의 나이은 : ");
		age =sc.nextInt();
		
		double weight;
		System.out.print("당신의 체중은 : ");
		weight =sc.nextDouble();
		
		Boolean single;
		System.out.print("당신의 결혼은 : ");
		single =sc.nextBoolean();
		
		
		
		System.out.println("당신의 이름은"+name+"이고"+"나이는"+age+"살이고"+city+"에 살고 당신의 체중은"+weight+"결혼은"+single);
		
		sc.close();

	}

}
