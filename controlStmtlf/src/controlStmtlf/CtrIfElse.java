package controlStmtlf;

import java.util.Scanner;

public class CtrIfElse {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				int year;
				
				System.out.println("년도 : ");
				year = sc.nextInt();
				//4의 배수이고 100의 배수는 아니고 400의 배수이면 윤년
				if(year%4==0 && year%100!=0 || year%400==0)
					System.out.println(year+"년은 윤년(leap year)입니다.");
				else
					System.out.println(year+"년은 평년(common year)입니다.");
				sc.close();
				
			}

		

}


