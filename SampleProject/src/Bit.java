package operator;

public class Bit {

	public static void main(String[] args) {
		int a=3,b=5;
		// 0000 0011 = 3
		// 0000 0101 = 5
		
		System.out.println("~"+a+"="+(~a)); //tield : ~
		System.out.println(a+"&"+b+"="+(a&b));
		System.out.println(a+"^"+b+"="+(a^b));
		System.out.println(a+"|"+b+"="+(a|b));
		
		//~(1의 보수) : 0을 1로 바꾸고,1을 0으로 바꿈
		
	}

}
