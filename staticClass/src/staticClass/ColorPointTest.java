package staticClass;

public class ColorPointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "red");
		cp.showColorPoint();
		
		Point p;
		
		p=cp;//�� �ɽ��� ���� cp�� ����ִ� x,y,color �߿� p���� �����ִ� x,y������ �Ҵ��Ѵ�
		
		System.out.println(p.x);
	}

}
