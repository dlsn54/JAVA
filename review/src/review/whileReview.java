package review;

import java.util.Scanner;

public class whileReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0,n;
		double sum=0;
		
		System.out.println("���� �Է� �� �������� 0�� �Է��ϼ���");
		
		
		
		while((n= sc.nextInt()) != 0) {
			sum+=n;
			count++;
		}
		System.out.println(count+"���� ������ �Է��߽��ϴ�.");
		System.out.println("�Է��� ������ ����� "+(sum/count)+"�Դϴ�.");
		
		sc.close();
	
	
	
	
	
	
	
	}

}
