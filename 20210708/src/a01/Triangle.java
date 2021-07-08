package a01;
//  메인 클래스(public class)는 클래스당 하나
public class Triangle {
	private int width,height;
	private double r;
	private final double PI = 3.14;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	// 부가적인기능
	public double area() {
		return width*height/2.0;
	}
	
	public double volume() {
		return PI*r*r;
	}
	
	public void show() {
		System.out.println("면적 : " + area() );
		System.out.println("부피 : " + volume());		
		System.out.println("반지름 : " + getR());
		System.out.println("가로의 길이 : " + getWidth());
		System.out.println("세로의 길이 : " + getHeight());
	}
	
	
}


