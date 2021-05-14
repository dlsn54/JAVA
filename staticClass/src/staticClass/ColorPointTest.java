package staticClass;

public class ColorPointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "red");
		cp.showColorPoint();
		
		Point p;
		
		p=cp;//업 케스팅 현제 cp에 들어있는 x,y,color 중에 p에서 쓸수있는 x,y값만을 할당한다
		
		System.out.println(p.x);
	}

}
