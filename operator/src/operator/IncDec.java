package operator;


public class IncDec {

	public static void main(String[] args) {
		int a= 6,b;

		System.out.println("a ="+a);
		a++;
		System.out.println("a ="+a);
		++a;
		System.out.println("a ="+a);
		a+=1;
		System.out.println("a ="+a);
		a=a+1;
		System.out.println("a ="+a);

		
		a=1;
		b=a++;
        System.out.println("a= "+a+"  b ="+b);		
		
        a=1;
		b=++a;
        System.out.println("a= "+a+"  b ="+b);

        a=1;
		b= a++ + a++ + a++ + a++;
		// 4     3      2    1
        System.out.println("a= "+a+"  b ="+b);
        
        a=1;
		b= ++a + ++a + ++a + ++a;
		//   5     4     3     2
        System.out.println("a= "+a+"  b ="+b);

		
	}

}
