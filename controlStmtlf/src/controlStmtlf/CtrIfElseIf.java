package controlStmtlf;

import java.util.Scanner;

public class CtrIfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.println("성적 입력 : ");
		score =sc.nextInt();

		if(score>=90) 
			System.out.println("당신의 등급(grade)은 A입니다.");
		else if(score>=80) 
			System.out.println("당신의 등급(grade)은 B입니다.");
		else if(score>=70) 
			System.out.println("당신의 등급(grade)은 C입니다.");
		else if(score>=60) 
			System.out.println("당신의 등급(grade)은 D입니다.");
		else
			System.out.println("당신의 등급(grade)은 F입니다.");
		

	}

}
