package controlStmtlf;

import java.util.Scanner;

public class CtrlSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.println("성적 : ");
		score=sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("당신의 등급(grade)은 A입니다."); break;
		case 8:
			System.out.println("당신의 등급(grade)은 B입니다."); break;
		case 7:
			System.out.println("당신의 등급(grade)은 C입니다."); break;
		case 6:
			System.out.println("당신의 등급(grade)은 D입니다."); break;
		default:
			System.out.println("당신의 등급(grade)은 F입니다."); break;
		}
	}

}
