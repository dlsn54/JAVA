package review;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max=-2147483648;
		int min=2147483647;
		int sum=0;
		double avg;
		
		for(int i=0; i<intArray.length;i++) {
			intArray[i]=sc.nextInt();
			sum+=intArray[i];
			if(intArray[i]>max)
				max=intArray[i];
			if(intArray[i]<min)
				min=intArray[i];
		}
		avg=(double)sum/intArray.length;
		System.out.print("�迭�� ���� =");
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+",");

		System.out.println();
		System.out.println("�� = "+sum+"��� = "+avg);
		System.out.println("�ִ밪 = "+max+",�ּҰ� = "+min);
		sc.close();
	}

}
