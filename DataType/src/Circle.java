public class Circle{
	
	public static void main(String[] args) {
		final double PI=3.14;
		double radius=10.4;
		double circleArea=PI*radius*radius;
		double circleCir=2*PI*radius;

		System.out.printf("������ = %.2f \n", radius);
		System.out.printf("���� ���� = %.2f \n", circleArea);
		System.out.printf("���� �ѷ� = %.2f", circleCir);
	}
}