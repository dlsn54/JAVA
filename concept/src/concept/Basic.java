package concept;

public class Basic {

	private int height;
	private int width;
	private String name;
	
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int whidth) {
		this.width = whidth;
	}
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height =height;
	}
	



	public int area(int height,int width) {
		return height*width;
	}
	

	public String toString() {
		return "사각형 높이 : "+height+", 너비 : "+width;
	}
}
