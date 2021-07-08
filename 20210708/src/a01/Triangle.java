package a01;
//  ���� Ŭ����(public class)�� Ŭ������ �ϳ�
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
	
	// �ΰ����α��
	public double area() {
		return width*height/2.0;
	}
	
	public double volume() {
		return PI*r*r;
	}
	
	public void show() {
		System.out.println("���� : " + area() );
		System.out.println("���� : " + volume());		
		System.out.println("������ : " + getR());
		System.out.println("������ ���� : " + getWidth());
		System.out.println("������ ���� : " + getHeight());
	}
	
	
}


