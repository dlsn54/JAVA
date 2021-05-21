class shape{
	public void draw() {
		System.out.println("draw");
	}
}
class line extends shape{
	public void draw() {
		System.out.println("line");
	}
}
class Rect extends shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class OverridingTest{
	static void print(shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		line line= new line();
		print(line);
		
		print(new shape());
	}


}