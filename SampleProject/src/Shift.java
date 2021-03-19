package operator;

public class Shift {

	public static void main(String[] args) {
	
		int a= 12, b=-8;

		System.out.printf("%d << %d = %d\n",a,2,(a << 2));
		//2^n 값을 곱한 결과
		System.out.printf("%d >> %d = %d\n",a,2,(a >> 2));
		//2^n 값을 나눈 결과
		System.out.printf("%d >> %d = %d\n",b,2,(b >> 2));
		//오른쪽으로 시프트 후 최상위 비트의 값으로 채움 
		System.out.printf("%d >>> %d = %d\n",b,2,(b >>> 2));
		//오른쪽으로 시프트 후 무조건 0으로 채움 
		
		
	}
	

}
